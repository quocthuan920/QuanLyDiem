/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.BoTinhGi;
import Model.DBConnection;
import View.Bangdiemlophoc;
import View.Bangdiemlopsinhhoat;
import View.Chuandaura;
import View.FrameGiangVien;
//import View.bieudo;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class GiangVienController {
    private FrameGiangVien gv_form;
    private JButton jbtxem;
    private JButton jbtThongke;
    private JPanel jpnView;
    private JButton jbtcvht;

    public GiangVienController(FrameGiangVien form, JButton jbtxem, JButton jbtThongke, JPanel jpnView,JButton jbtcvht) {
        try {
            this.gv_form=form;
            this.jbtxem=jbtxem;
            this.jbtThongke=jbtThongke;
            this.jpnView=jpnView;
            this.jbtcvht=jbtcvht;
            Connection conn_set= DBConnection.getConnection();
            Statement stm=conn_set.createStatement();
            String sql="Select * from lopsinhhoat where covan='"+gv_form.magv+"'";
            ResultSet rs=stm.executeQuery(sql);
            while (rs.next())
            {
                jbtcvht.setVisible(true);
            }
            rs.close();stm.close();conn_set.close();
        } catch (SQLException ex) {
            Logger.getLogger(GiangVienController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    public void setEvent() {
        jbtxem.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    //Hien thi ma lop de giang vien chon:
                    Connection conn=DBConnection.getConnection();
                    Statement stm=conn.createStatement();
                    String sql1="select * from lophoc where magv='"+gv_form.magv+"'";
                    ArrayList arr;
                    try (ResultSet rs1 = stm.executeQuery(sql1)) {
                        arr = new ArrayList();
                        while(rs1.next())
                        {
                            arr.add(rs1.getString("malophoc"));
                        }
                        rs1.close();
                    }
                    Object [] op=new Object[arr.size()];
                    for(int i=0;i<arr.size();i++)
                    {
                     op[i]=arr.get(i);
                    }
                    String selection=(String) JOptionPane.showInputDialog(null,"Xin mời chọn mã lớp:","Selection!!!", JOptionPane.PLAIN_MESSAGE,null, op,"");
                    // Hien thi bang diem:
                    jpnView.removeAll();
                    jpnView.setLayout(new BorderLayout());
                    jpnView.add(new Bangdiemlophoc(selection));
                    jpnView.validate();
                    jpnView.repaint();
                    stm.close();conn.close();
                            } catch (SQLException ex) {
                    Logger.getLogger(GiangVienController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        jbtThongke.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    //Hien thi cac ma lop giang vien day
                    Connection conn=DBConnection.getConnection();
                    Statement stm=conn.createStatement();
                    String sql1="select * from lophoc where magv='"+gv_form.magv+"'";
                    ArrayList arr1,arr2;
                    try (ResultSet rs1 = stm.executeQuery(sql1)) {
                        arr1 = new ArrayList();
                        while(rs1.next())
                        {
                            arr1.add(rs1.getString("malophoc"));
                        }
                        rs1.close();
                    }
                    Object [] op1=new Object[arr1.size()];
                    for(int i=0;i<arr1.size();i++)
                    {
                     op1[i]=arr1.get(i);
                    }
                    // giang vien chon ma lop muon xem
                    String classname=(String) JOptionPane.showInputDialog(null,"Xin mời chọn mã lớp:","Selection!!!", JOptionPane.PLAIN_MESSAGE,null, op1,"");
                    
                    String sql2="select sinhvien.hotensv,sinhvien.mssv,sv_lophoc.malophoc,monhoc.mamon,monhoc.tenmon from sv_lophoc,sinhvien,lophoc,monhoc\n" +
"                                where sinhvien.mssv=sv_lophoc.mssv\n" +
"                                and monhoc.mamon=lophoc.mamon\n" +
"                                and sv_lophoc.malophoc=lophoc.malophoc\n" +
"                                and sv_lophoc.malophoc='"+classname+"'";
                    // show bang diem
                    jpnView.removeAll();
                    jpnView.setLayout(new BorderLayout());
                    Chuandaura cdr=new Chuandaura();
                    try (ResultSet rs2 = stm.executeQuery(sql2)) {
                        while (rs2.next()) {                            
                         BoTinhGi controll=new BoTinhGi();
                         Vector vec=new Vector();
                         vec.add(rs2.getString("hotensv"));
                         vec.add(rs2.getString("mssv"));
                         vec.add(rs2.getString("tenmon"));
                         double [] tile=controll.getTiLeDatGi(rs2.getString("mssv"),rs2.getString("mamon"));
//                            System.out.println(tile[0]);
                         vec.add((double)Math.round(tile[0]*100)/100);
                         vec.add((double)Math.round(tile[1]*100)/100);
                         vec.add((double)Math.round(tile[2]*100)/100);
                         vec.add((double)Math.round(tile[3]*100)/100);
                         cdr.vt=vec;
                           cdr.setData();
                        }
                        cdr.showData();
                        rs2.close();
                        
                    }
                    // show bang len panel
                    jpnView.add(cdr);
                    jpnView.validate();
                    jpnView.repaint();
                   
                    
                    
                } catch (SQLException ex) {
                    Logger.getLogger(GiangVienController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
         jbtcvht.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                try {
                    // Hien thi cac ma lop sinh hoat ma giang vien lam cvht:
                    Connection conn= DBConnection.getConnection();
                    Statement stm=conn.createStatement();
                    String sql="Select * from lopsinhhoat where covan='"+gv_form.magv+"'";
                    ResultSet rs=stm.executeQuery(sql);
                    ArrayList arr=new ArrayList();
                    jpnView.removeAll();
                    jpnView.setLayout(new BorderLayout());
                    while (rs.next())
                    {
                         
                         arr.add(rs.getString("malopsh"));
                    }    
                    rs.close();
                    Object [] op=new Object[arr.size()];
                    for(int i=0;i<arr.size();i++)
                    {
                     op[i]=arr.get(i);
                    }
                    String selection=(String) JOptionPane.showInputDialog(null,"Xin mời chọn mã lớp:","Selection!!!", JOptionPane.PLAIN_MESSAGE,null, op,"");
                    jpnView.add(new Bangdiemlopsinhhoat(selection));
                    jpnView.validate();
                    jpnView.repaint();
                    stm.close();conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiangVienController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}
