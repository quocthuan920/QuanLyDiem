package Controler;

import Model.DBConnection;
import View.FrameGiangVien;
import View.LoginForm;
import View.Nhaquanly.FrameQuanLi;
import View.Sinhvien.FrameSinhVien;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TaiKhoanController {

    private LoginForm dialog;
    private JButton btnSubmit;
    private JTextField jtfTenDangNhap;
    private JPasswordField jtfMatKhau;
    private JLabel jlbMsg;

    //constructor
    public TaiKhoanController(LoginForm dialog, JButton btnSubmit, JTextField jtfTenDangNhap,
            JPasswordField jtfMatKhau, JLabel jlbMsg) {
        this.dialog = dialog;
        this.btnSubmit = btnSubmit;
        this.jtfTenDangNhap = jtfTenDangNhap;
        this.jtfMatKhau = jtfMatKhau;
        this.jlbMsg = jlbMsg;

    }

    public void setEvent() {
        btnSubmit.addMouseListener(new MouseAdapter() {
            @Override             //overrie button đăng nhập
            public void mouseClicked(MouseEvent e) {
                if (jtfTenDangNhap.getText().length() == 0 || jtfMatKhau.getText().length() == 0) {
                    jlbMsg.setText("Chưa điền đủ thông tin!");        // nếu thiếu thông tin thì xuất ra
                } else {
                    try {
                        Connection cons = DBConnection.getConnection();        // kết nối DB
                        String sql1 = "SELECT magv,pass,hotengv FROM giangvien WHERE magv='" + jtfTenDangNhap.getText().toString() + "' and pass='" + jtfMatKhau.getText().toString() + "'";
                        String sql2 = "SELECT mssv,pass,hotensv FROM sinhvien WHERE mssv='" + jtfTenDangNhap.getText().toString() + "' and pass='" + jtfMatKhau.getText().toString() + "'";
                        String sql3 = "SELECT matk,pass, hotengv FROM truongkhoa join giangvien on truongkhoa.matk=giangvien.magv WHERE matk='" + jtfTenDangNhap.getText().toString() + "' and pass='" + jtfMatKhau.getText().toString() + "'";

                        PreparedStatement ps1 = cons.prepareCall(sql1);
                        PreparedStatement ps2 = cons.prepareCall(sql2);
                        PreparedStatement ps3 = cons.prepareCall(sql3);
                        ResultSet rs1 = ps1.executeQuery();
                        ResultSet rs2 = ps2.executeQuery();
                        ResultSet rs3 = ps3.executeQuery();
                        if (rs3.next()) {
                            int a = JOptionPane.showConfirmDialog(btnSubmit, "Xem với tư cách quản lí");
                            if (a == JOptionPane.YES_OPTION) {
                                FrameQuanLi jfQuanLi = new FrameQuanLi();         // chuyển tới frame giảng viên
                            jfQuanLi.setLocationRelativeTo(null);
                            jfQuanLi.setVisible(true);
                            dialog.dispose();
                            } else {
                            String name = rs3.getString("hotengv");
                            String ma = rs3.getString("matk");
                            FrameGiangVien jfGiangVien = new FrameGiangVien(name, ma);         // chuyển tới frame giảng viên
                            jfGiangVien.setLocationRelativeTo(null);
                            jfGiangVien.setVisible(true);
                            dialog.dispose();

                        }
                            

                        } else if (rs1.next()) {
                            String name = rs1.getString("hotengv");
                            String ma = rs1.getString("magv");
                            FrameGiangVien jfGiangVien = new FrameGiangVien(name, ma);         // chuyển tới frame giảng viên
                            jfGiangVien.setLocationRelativeTo(null);
                            jfGiangVien.setVisible(true);
                            dialog.dispose();

                        } else if (rs2.next()) {
                            String mssv = rs2.getString("mssv");
                            FrameSinhVien jfSinhVien = new FrameSinhVien(mssv);          // chuyển tới frame sinh viên
                            jfSinhVien.setLocationRelativeTo(null);
                            jfSinhVien.setVisible(true);
                            dialog.dispose();
                        } else {
                            jlbMsg.setText("Sai thông tin đăng nhập!");
                        }
                        ps1.close();
                        rs2.close();
                        ps1.close();
                        rs2.close();
                        cons.close(); //đóng DB
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }

                }
            }
        });

    }

}
