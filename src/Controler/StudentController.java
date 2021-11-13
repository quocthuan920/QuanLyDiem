/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.DBConnection;
import View.Nhaquanly.StudentPanel;
import View.Sinhvien.FrameSinhVien;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class StudentController {

    private StudentPanel studentpanel;
    private JTable jTStudent;
    private JTextField jTFMssv;
    private JButton jBXem;
    private JLabel jLb1;

    // constructor
    public StudentController(StudentPanel studentpanel, JTable jTStudent, JTextField jTFMssv, JButton jBXem, JLabel jLb1) {
        this.studentpanel = studentpanel;
        this.jTStudent = jTStudent;
        this.jTFMssv = jTFMssv;
        this.jBXem = jBXem;
        this.jLb1 = jLb1;
    }

    public void setEvent() {
        try {
            Connection cons = DBConnection.getConnection(); // kết nối DB
            String sql = "SELECT mssv, hotensv, malopsh, totnghiep FROM sinhvien";
            PreparedStatement ps = cons.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            String[] arr = {"Họ và tên", "Mssv", "Lớp", "Tình trạng tốt ngiệp"};
            DefaultTableModel model = new DefaultTableModel(arr, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {                   //override không cho thay đổi phần tử
                    return false;
                }
            };
            while (rs.next()) {
                Vector vt = new Vector();
                vt.add(rs.getString("hotensv"));
                vt.add(rs.getString("mssv"));
                vt.add(rs.getString("malopsh"));
                if (rs.getString("totnghiep").equals("1")) {                 // thêm các giá trị vào bảng bằng Vector
                    vt.add("Đã tốt nghiệp");
                } else {
                    vt.add("Chưa tốt nghiệp");
                }
                model.addRow(vt);
                jTStudent.setModel(model);
            }
            rs.close();
            ps.close();
            cons.close(); //Đóng DB
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        jBXem.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (jTFMssv.getText().equals("")) {
                    jLb1.setText("Vui lòng nhập mã số sinh viên tìm kiếm!!!"); // nếu text field còn trống thì xuất ra 
                } else {
                    try {
                        Connection cons = DBConnection.getConnection();
                        String sql = "SELECT mssv FROM sinhvien WHERE mssv = '" + jTFMssv.getText() + "'";
                        PreparedStatement ps = cons.prepareCall(sql);
                        ResultSet rs = ps.executeQuery();
                        if (rs.next()) {
                            FrameSinhVien jfSinhVien = new FrameSinhVien(jTFMssv.getText(), 1);
                            jfSinhVien.setLocationRelativeTo(null);
                            jfSinhVien.setDefaultCloseOperation(jfSinhVien.DISPOSE_ON_CLOSE);
                            jfSinhVien.setVisible(true);
                        } else {
                            jLb1.setText("Không tìm thấy sinh viên, vui lòng nhập lại mã số sinh viên!!!"); // kiểm tra DB, nếu không tìm thấy sv thì xuất ra
                        }

                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }

                }
            }
        }
        );
    }
}
