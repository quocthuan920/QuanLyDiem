/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Sinhvien;

import Controler.ProfileController;

/**
 *
 * @author LENOVO
 */
public class ProfilePanel extends javax.swing.JPanel {

    /**
     * Creates new form ProfilePanel
     */
    public String mssv;

    public ProfilePanel(String mssv) {
        initComponents();
        jProgressBar1.setVisible(false);
        jProgressBar2.setVisible(false);
        jProgressBar3.setVisible(false);
        jProgressBar4.setVisible(false);
        jProgressBar5.setVisible(false);
        jProgressBar6.setVisible(false);                 
        jProgressBar7.setVisible(false);
        jProgressBar8.setVisible(false);
        jProgressBar9.setVisible(false);
        jProgressBar10.setVisible(false);
        jlbl1.setVisible(false);
        jlbl2.setVisible(false);
        jlbl3.setVisible(false);
        jlbl4.setVisible(false);
        jlbl5.setVisible(false);
        jlbl6.setVisible(false);
        jlbl7.setVisible(false);
        jlbl8.setVisible(false);
        jlbl9.setVisible(false);
        jlbl10.setVisible(false);
        this.mssv = mssv;
        ProfileController controler = new ProfileController(mssv, this, jLbTen, jLbMssv, jLbGioiTinh, jLbNgaySinh, jLbNganh, jLbLop, jLbTrangThai, jProgressBar1, jProgressBar2, jProgressBar3, jProgressBar4, jProgressBar5, jProgressBar6, jProgressBar7, jProgressBar8, jProgressBar9, jProgressBar10, jlbl1, jlbl2, jlbl3, jlbl4, jlbl5, jlbl6, jlbl7, jlbl8, jlbl9, jlbl10);
        controler.setEven();            //gọi profile controller
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLbMssv = new javax.swing.JLabel();
        jLbTen = new javax.swing.JLabel();
        jLbGioiTinh = new javax.swing.JLabel();
        jLbNgaySinh = new javax.swing.JLabel();
        jLbKhoa = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLbNganh = new javax.swing.JLabel();
        jLbLop = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLbTrangThai = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jProgressBar3 = new javax.swing.JProgressBar();
        jProgressBar4 = new javax.swing.JProgressBar();
        jProgressBar5 = new javax.swing.JProgressBar();
        jProgressBar6 = new javax.swing.JProgressBar();
        jProgressBar7 = new javax.swing.JProgressBar();
        jProgressBar8 = new javax.swing.JProgressBar();
        jProgressBar9 = new javax.swing.JProgressBar();
        jProgressBar10 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jlbl1 = new javax.swing.JLabel();
        jlbl2 = new javax.swing.JLabel();
        jlbl3 = new javax.swing.JLabel();
        jlbl4 = new javax.swing.JLabel();
        jlbl5 = new javax.swing.JLabel();
        jlbl6 = new javax.swing.JLabel();
        jlbl7 = new javax.swing.JLabel();
        jlbl8 = new javax.swing.JLabel();
        jlbl9 = new javax.swing.JLabel();
        jlbl10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(44, 62, 80));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1600, 800));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("My Profile");
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Họ và tên:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mã số sinh viên:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Giới tính:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ngày sinh:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Khoa:");

        jLbMssv.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLbMssv.setForeground(new java.awt.Color(255, 255, 255));
        jLbMssv.setText(" ");

        jLbTen.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLbTen.setForeground(new java.awt.Color(255, 255, 255));
        jLbTen.setText(" ");

        jLbGioiTinh.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLbGioiTinh.setForeground(new java.awt.Color(255, 255, 255));
        jLbGioiTinh.setText(" ");

        jLbNgaySinh.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLbNgaySinh.setForeground(new java.awt.Color(255, 255, 255));
        jLbNgaySinh.setText(" ");

        jLbKhoa.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLbKhoa.setForeground(new java.awt.Color(255, 255, 255));
        jLbKhoa.setText("Khoa học và Kĩ thuật Thông tin");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Ngành:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Lớp sinh hoạt: ");

        jLbNganh.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLbNganh.setForeground(new java.awt.Color(255, 255, 255));
        jLbNganh.setText(" ");

        jLbLop.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLbLop.setForeground(new java.awt.Color(255, 255, 255));
        jLbLop.setText(" ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Trạng thái:");

        jLbTrangThai.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLbTrangThai.setForeground(new java.awt.Color(255, 255, 255));
        jLbTrangThai.setText(" ");

        jProgressBar1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jProgressBar1.setForeground(new java.awt.Color(0, 153, 51));
        jProgressBar1.setStringPainted(true);

        jProgressBar2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jProgressBar2.setForeground(new java.awt.Color(0, 153, 51));
        jProgressBar2.setStringPainted(true);

        jProgressBar3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jProgressBar3.setForeground(new java.awt.Color(0, 153, 51));
        jProgressBar3.setStringPainted(true);

        jProgressBar4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jProgressBar4.setForeground(new java.awt.Color(0, 153, 51));
        jProgressBar4.setStringPainted(true);

        jProgressBar5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jProgressBar5.setForeground(new java.awt.Color(0, 153, 51));
        jProgressBar5.setStringPainted(true);

        jProgressBar6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jProgressBar6.setForeground(new java.awt.Color(0, 153, 51));
        jProgressBar6.setStringPainted(true);

        jProgressBar7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jProgressBar7.setForeground(new java.awt.Color(0, 153, 51));
        jProgressBar7.setStringPainted(true);

        jProgressBar8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jProgressBar8.setForeground(new java.awt.Color(0, 153, 51));
        jProgressBar8.setStringPainted(true);

        jProgressBar9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jProgressBar9.setForeground(new java.awt.Color(0, 153, 51));
        jProgressBar9.setStringPainted(true);

        jProgressBar10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jProgressBar10.setForeground(new java.awt.Color(0, 153, 51));
        jProgressBar10.setStringPainted(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 751, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mức độ đạt các chuẩn đầu ra");

        jlbl1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbl1.setForeground(new java.awt.Color(255, 255, 255));
        jlbl1.setText("LO1:");

        jlbl2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbl2.setForeground(new java.awt.Color(255, 255, 255));
        jlbl2.setText("LO2:");

        jlbl3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbl3.setForeground(new java.awt.Color(255, 255, 255));
        jlbl3.setText("LO3:");

        jlbl4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbl4.setForeground(new java.awt.Color(255, 255, 255));
        jlbl4.setText("LO4:");

        jlbl5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbl5.setForeground(new java.awt.Color(255, 255, 255));
        jlbl5.setText("LO5:");

        jlbl6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbl6.setForeground(new java.awt.Color(255, 255, 255));
        jlbl6.setText("LO6:");

        jlbl7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbl7.setForeground(new java.awt.Color(255, 255, 255));
        jlbl7.setText("LO7:");

        jlbl8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbl8.setForeground(new java.awt.Color(255, 255, 255));
        jlbl8.setText("LO8:");

        jlbl9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbl9.setForeground(new java.awt.Color(255, 255, 255));
        jlbl9.setText("LO9:");

        jlbl10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlbl10.setForeground(new java.awt.Color(255, 255, 255));
        jlbl10.setText("LO10:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(700, 700, 700)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(422, 422, 422)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(625, 625, 625)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(425, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(225, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLbGioiTinh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                            .addComponent(jLbMssv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLbTen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLbNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(276, 276, 276)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel12)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLbNganh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLbLop, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(jLbTrangThai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlbl2)
                                .addGap(18, 18, 18)
                                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlbl1)
                                .addGap(18, 18, 18)
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlbl3)
                                .addGap(18, 18, 18)
                                .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlbl4)
                                .addGap(18, 18, 18)
                                .addComponent(jProgressBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlbl5)
                                .addGap(18, 18, 18)
                                .addComponent(jProgressBar5, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlbl6)
                            .addComponent(jlbl7)
                            .addComponent(jlbl8)
                            .addComponent(jlbl9)
                            .addComponent(jlbl10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jProgressBar6, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                            .addComponent(jProgressBar7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jProgressBar8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jProgressBar9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jProgressBar10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(224, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLbTen)
                    .addComponent(jLabel6)
                    .addComponent(jLbKhoa))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLbMssv)
                    .addComponent(jLabel12)
                    .addComponent(jLbNganh))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLbGioiTinh)
                    .addComponent(jLabel13)
                    .addComponent(jLbLop))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLbNgaySinh)
                    .addComponent(jLabel7)
                    .addComponent(jLbTrangThai))
                .addGap(45, 45, 45)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jProgressBar6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jProgressBar7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jProgressBar8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProgressBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jProgressBar9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProgressBar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jProgressBar10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProgressBar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbl10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLbGioiTinh;
    private javax.swing.JLabel jLbKhoa;
    private javax.swing.JLabel jLbLop;
    private javax.swing.JLabel jLbMssv;
    private javax.swing.JLabel jLbNganh;
    private javax.swing.JLabel jLbNgaySinh;
    private javax.swing.JLabel jLbTen;
    private javax.swing.JLabel jLbTrangThai;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar10;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JProgressBar jProgressBar5;
    private javax.swing.JProgressBar jProgressBar6;
    private javax.swing.JProgressBar jProgressBar7;
    private javax.swing.JProgressBar jProgressBar8;
    private javax.swing.JProgressBar jProgressBar9;
    private javax.swing.JLabel jlbl1;
    private javax.swing.JLabel jlbl10;
    private javax.swing.JLabel jlbl2;
    private javax.swing.JLabel jlbl3;
    private javax.swing.JLabel jlbl4;
    private javax.swing.JLabel jlbl5;
    private javax.swing.JLabel jlbl6;
    private javax.swing.JLabel jlbl7;
    private javax.swing.JLabel jlbl8;
    private javax.swing.JLabel jlbl9;
    // End of variables declaration//GEN-END:variables
}
