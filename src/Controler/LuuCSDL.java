/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.DBConnection;
import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import java.awt.event.InputMethodEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Admin
 */
public class LuuCSDL {

    public String Ai;
    public String malop;
    public JButton jbtsave;
    public JTable jtable;
    public JTextField jtfc1;
    public JTextField jtfc2;
    public JTextField jtfc3;
    public String mssv;
    public JTextField jtfscore;

    public LuuCSDL(String ai, JButton jbtsave, JTable table, String malop, String mssv, JTextField jtfc1, JTextField jtfc2, JTextField jtfc3, JTextField jtfscore) {
        this.Ai = ai;
        this.jbtsave = jbtsave;
        this.jtable = table;
        this.malop = malop;
        this.mssv = mssv;
        this.jtfc1 = jtfc1;
        this.jtfc2 = jtfc2;
        this.jtfc3 = jtfc3;
        this.jtfscore = jtfscore;
    }

    public void setEvent() {
        jbtsave.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String sql = "";
                if (Ai.equals("1") || Ai.equals("3")) {

                    sql = "Update bangdiema" + Ai + " set tongdiema" + Ai + "=" + jtfscore.getText() + " where mssv='" + mssv + "' and malop='" + malop + "'";
                } else {
                    sql = "Update bangdiema" + Ai + " set tongdiema" + Ai + "=" + jtfscore.getText() + ", diemcau1=" + jtfc1.getText() + ", diemcau2=" + jtfc2.getText() + ", diemcau3=" + jtfc3.getText() + " where mssv='" + mssv + "' and malop='" + malop + "'";
                }
                try {
                    Connection cons = DBConnection.getConnection();
// kết nối DB
                    PreparedStatement ps = cons.prepareCall(sql);
                    ps.executeUpdate();
                    if (Ai.equals("1")) {
                        jtable.setValueAt(jtfscore.getText(), jtable.getSelectedRow(), 2);
                    } else {
                        jtable.setValueAt(jtfc1.getText(), jtable.getSelectedRow(), 2);
                        jtable.setValueAt(jtfc2.getText(), jtable.getSelectedRow(), 3);
                        jtable.setValueAt(jtfc3.getText(), jtable.getSelectedRow(), 4);
                        jtable.setValueAt(jtfscore.getText(), jtable.getSelectedRow(), 5);

                    }
                } catch (Exception ex) {
                    System.out.println("loi");
                    printStackTrace();

                }
            }
        });
        
    }
}
