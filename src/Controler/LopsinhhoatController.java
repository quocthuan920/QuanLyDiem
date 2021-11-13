/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.BoTinhGi;
import Model.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class LopsinhhoatController {

    private String selection;private JTable jtableView;
    public LopsinhhoatController(JTable jtableView, String selection) {
        this.selection=selection;this.jtableView=jtableView;
    }
    public void setEvent(){
        try {
            // Khoi tao cac doi tuong:
            String []title={"Mã lớp","Tên môn","Điểm quá trình","Điểm giữa kì","Điểm thực hành","Điểm cuối kì","G1","G2","G3","G4"};
            DefaultTableModel model=new DefaultTableModel(title,0);
            Connection conn=DBConnection.getConnection();
            Statement stm=conn.createStatement();
            String sql1="select distinct * from sinhvien where malopsh='"+selection+"'";
            ArrayList arr=new ArrayList();
            ResultSet rs1=stm.executeQuery(sql1);
            while(rs1.next())
            {
                // Danh sach sinh vien sinh hoat trong lop duoc chon
                arr.add(rs1.getString("hotensv"));
            }
            rs1.close();
            Object[] ob=new Object[arr.size()];
            for(int i=0;i<arr.size();i++)
            {
                ob[i]=arr.get(i);
            }
            // Lua chon sinh vien de xem bang diem
            String name=(String) JOptionPane.showInputDialog(null,"Xin mời chọn sinh viên:","Selection!!!", JOptionPane.PLAIN_MESSAGE,null, ob,"");
            String sql2="select distinct sinhvien.hotensv,sinhvien.mssv,monhoc.mamon, sv_lophoc.malophoc,lophoc.tenlop,bangdiema1.tongdiema1,bangdiema2.tongdiema2,bangdiema3.tongdiema3,bangdiema4.tongdiema4\n" +
"                        from sv_lophoc,lophoc,bangdiema1,bangdiema2,bangdiema3,bangdiema4,lopsinhhoat,sinhvien,monhoc\n" +
"                        where bangdiema1.malop=sv_lophoc.malophoc \n" +
"                        and monhoc.mamon=lophoc.mamon\n" +
"                        and bangdiema2.malop=sv_lophoc.malophoc\n" +
"                        and bangdiema3.malop=sv_lophoc.malophoc \n" +
"                        and bangdiema4.malop=sv_lophoc.malophoc\n" +
"                        and sv_lophoc.mssv=sinhvien.mssv\n" +
"                        and lophoc.malophoc=sv_lophoc.malophoc\n" +
"                        and sinhvien.malopsh=lopsinhhoat.malopsh\n" +
"                        and lopsinhhoat.malopsh='"+selection+"'" +
"                        and sinhvien.hotensv='"+name+"'";
            ResultSet rs2=stm.executeQuery(sql2);
            while (rs2.next()) {  
                // Them thong tin vao bang
                Vector vt=new Vector();
                vt.add(rs2.getString("malophoc"));
                vt.add(rs2.getString("tenlop"));
                vt.add(rs2.getString("tongdiema1"));
                vt.add(rs2.getString("tongdiema2"));
                vt.add(rs2.getString("tongdiema3"));
                vt.add(rs2.getString("tongdiema4"));
                BoTinhGi gi=new BoTinhGi();
                 double [] tile=gi.getTiLeDatGi(rs2.getString("mssv"),rs2.getString("mamon"));
                         vt.add(tile[0]);
                         vt.add(tile[1]);
                         vt.add(tile[2]);
                         vt.add(tile[3]);
                model.addRow(vt);
                jtableView.setModel(model);
            }
            rs2.close();stm.close();conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(LopsinhhoatController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
