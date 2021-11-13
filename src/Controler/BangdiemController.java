/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.DBConnection;
import View.Bangdiemlophoc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class BangdiemController {
    private Bangdiemlophoc bangdiem;private String s;private JTable jTableView;
    public BangdiemController(Bangdiemlophoc bangdiem,JTable jTableView, String selection) {
        this.bangdiem=bangdiem;this.s=selection;
        this.jTableView=jTableView;
        
    }
    public void setEvent() throws SQLException{
        Connection conn=DBConnection.getConnection();
        Statement stm=conn.createStatement();
        // Khoi tao bang:
        String []title={"Mã lớp","Mã số sinh viên","Họ tên","Điểm quá trình","Điểm giữa kì","Điểm thực hành","Điểm cuối kì","ĐTB"};
        DefaultTableModel model=new DefaultTableModel(title,0);
        
            String sql1="select distinct sinhvien.mssv,sinhvien.hotensv, bangdiema1.tongdiema1,bangdiema2.tongdiema2,bangdiema3.tongdiema3,bangdiema4.tongdiema4,bangdiema1.malop\n" +
                        "from bangdiema1 ,bangdiema2, bangdiema3, bangdiema4 , sinhvien  , sv_lophoc,lophoc\n" +
                        "where bangdiema1.malop=lophoc.malophoc \n" +
                        "and bangdiema2.malop=lophoc.malophoc \n" +
                        "and bangdiema3.malop=lophoc.malophoc \n" +
                        "and bangdiema4.malop=lophoc.malophoc \n" +
                        "and lophoc.malophoc=sv_lophoc.malophoc\n" +
                        "and bangdiema1.mssv=sinhvien.mssv \n" +
                        "and bangdiema2.mssv=sinhvien.mssv \n" +
                        "and bangdiema3.mssv=sinhvien.mssv \n" +
                        "and bangdiema4.mssv=sinhvien.mssv \n" +
                        "and lophoc.malophoc='"+s+"'";                          
        try (ResultSet rs1 = stm.executeQuery(sql1)) {
            while(rs1.next())
            {
                Vector vt=new Vector();
                vt.add(rs1.getString("malop"));
                vt.add(rs1.getString("mssv"));
                vt.add(rs1.getString("hotensv"));
                vt.add(rs1.getString("tongdiema1"));
                vt.add(rs1.getString("tongdiema2"));
                vt.add(rs1.getString("tongdiema3"));
                vt.add(rs1.getString("tongdiema4"));
                float a1=Float.parseFloat(rs1.getString("tongdiema1"));
                float a2=Float.parseFloat(rs1.getString("tongdiema2"));
                float a3=Float.parseFloat(rs1.getString("tongdiema3"));
                float a4=Float.parseFloat(rs1.getString("tongdiema4"));
                float dtb=(float)Math.round((float)(a1*0.1+a2*0.2+a3*0.2+a4*0.5)*100)/100;
                vt.add(Float.toString(dtb));
                model.addRow(vt);
                jTableView.setModel(model);
                
            }
        }
                    
        
    }
}
