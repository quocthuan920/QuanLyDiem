/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.DBConnection;
import View.Sinhvien.GPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author LENOVO
 */
public class GoalController {

    private String mssv;
    private GPanel gpanel;
    private javax.swing.JButton jBXem;
    private javax.swing.JComboBox<String> jCBMon;
    private javax.swing.JLabel jLb1;
    private javax.swing.JLabel jLb2;
    private javax.swing.JLabel jLb3;
    private javax.swing.JLabel jLb4;
    private javax.swing.JLabel jLbG1;
    private javax.swing.JLabel jLbG2;
    private javax.swing.JLabel jLbG3;
    private javax.swing.JLabel jLbG4;

    // constructor
    public GoalController(String mssv, GPanel gpanel, JComboBox jCBMon, JButton jBXem, JLabel jLb1, JLabel jLb2, JLabel jLb3, JLabel jLb4, JLabel jLbG1, JLabel jLbG2, JLabel jLbG3, JLabel jLbG4) {
        this.mssv = mssv;
        this.gpanel = gpanel;
        this.jBXem = jBXem;
        this.jCBMon = jCBMon;
        this.jLb1 = jLb1;
        this.jLb2 = jLb2;
        this.jLb3 = jLb3;
        this.jLb4 = jLb4;
        this.jLbG1 = jLbG1;
        this.jLbG2 = jLbG2;
        this.jLbG3 = jLbG3;
        this.jLbG4 = jLbG4;
    }

    public void setEvent() {
        try {
            DefaultComboBoxModel model = new DefaultComboBoxModel();
            Connection cons = DBConnection.getConnection(); //kết nối DB
            String sql = "SELECT mamon FROM monhoc";
            PreparedStatement ps = cons.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String mon = rs.getString("mamon"); //Thêm danh sách mã môn vào combo box
                model.addElement(mon);
            }
            jCBMon.setModel(model);
            ps.close();
            rs.close();
            cons.close(); // đóng DB
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        jBXem.addMouseListener(new MouseAdapter() {
            @Override // override button xem 
            public void mouseClicked(MouseEvent e) {
                try {
                    String mamon = jCBMon.getSelectedItem().toString();
                    Connection cons = DBConnection.getConnection();
                    String sql = "SELECT g1, g2, g3, g4 FROM monhoc WHERE mamon = '" + mamon + "'";
                    PreparedStatement ps = cons.prepareCall(sql);
                    ResultSet rs = ps.executeQuery();
                    if(rs.next()){
                        jLb1.setText(rs.getString("g1")); // lấy các giá trị G[i] vào các label
                        jLb2.setText(rs.getString("g2"));
                        jLb3.setText(rs.getString("g3"));
                        jLb4.setText(rs.getString("g4"));
                        jLbG1.setVisible(true); //hiển thị các label lên panel
                        jLbG2.setVisible(true);
                        jLbG3.setVisible(true);
                        jLbG4.setVisible(true);
                        rs.close();
                        ps.close(); // đóng DB
                    } 
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }
}
