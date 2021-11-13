/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.DBConnection;
import View.Nhaquanly.ClassPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class ClassController {

    private ClassPanel classpanel;
    private JButton jBLsh;
    private JButton jBLh;
    private JTable jT1;

    //constructor
    public ClassController(ClassPanel classpanel, JButton jBLsh, JButton jBLh, JTable jT1) {
        this.classpanel = classpanel;
        this.jBLsh = jBLsh;
        this.jBLh = jBLh;
        this.jT1 = jT1;

    }

    //override button lớp học trong classpanel
    public void setEvent() {
        jBLh.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Connection cons = DBConnection.getConnection();//gọi DB
                    String sql = "SELECT malophoc, tenlop, hotengv, trangthai FROM lophoc join giangvien on lophoc.magv = giangvien.magv";
                    PreparedStatement ps = cons.prepareCall(sql);
                    ResultSet rs = ps.executeQuery();
                    String[] arr = {"Mã lớp học", "Môn học", "Tên giảng viên", "Trạng thái"};
                    DefaultTableModel model = new DefaultTableModel(arr, 0) {
                        @Override
                        public boolean isCellEditable(int row, int column) {
                            return false;
                        }
                    };
                    while (rs.next()) {
                        Vector vt = new Vector();
                        vt.add(rs.getString("malophoc"));
                        vt.add(rs.getString("tenlop"));
                        vt.add(rs.getString("hotengv"));
                        if (rs.getString("trangthai").equals("1")) {
                            vt.add("Trong quá trình");
                        } else {
                            vt.add("Đã kết thúc");
                        }
                        model.addRow(vt);
                        jT1.setModel(model);
                        
                    }
                    jBLh.setEnabled(false);
                    jBLsh.setEnabled(true);
                    rs.close();
                    ps.close();
                    cons.close();//đóng DB
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        //Override button lớp sinh hoạt
        jBLsh.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Connection cons = DBConnection.getConnection();//gọi DB
                    String sql = "SELECT malopsh, tenlop, khoahoc, hotengv FROM lopsinhhoat join giangvien on lopsinhhoat.covan = giangvien.magv";
                    PreparedStatement ps = cons.prepareCall(sql);
                    ResultSet rs = ps.executeQuery();
                    String[] arr = {"Mã lớp sinh hoạt", "Tên lớp sinh hoạt", "Khóa", "Cố vấn học tập"};
                    DefaultTableModel model = new DefaultTableModel(arr, 0) {
                        @Override
                        public boolean isCellEditable(int row, int column) {
                            return false;
                        }
                    }; //override không chỉnh sửa bảng
                    while (rs.next()) {
                        Vector vt = new Vector();
                        vt.add(rs.getString("malopsh"));
                        vt.add(rs.getString("tenlop"));
                        vt.add(rs.getString("khoahoc"));
                        vt.add(rs.getString("hotengv"));
                        model.addRow(vt);
                        jT1.setModel(model);  // thêm các giá trị vào bảng
                    }
                    jBLh.setEnabled(true);
                    jBLsh.setEnabled(false);
                    rs.close();
                    ps.close();
                    cons.close(); // đóng DB
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }

            }
        });
    }
}
