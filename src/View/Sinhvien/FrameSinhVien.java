/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Sinhvien;

import View.LoginForm;
import java.awt.BorderLayout;

/**
 *
 * @author LENOVO
 */
public class FrameSinhVien extends javax.swing.JFrame {

    /**
     * Creates new form Sinhvien
     */
    public String mssv;       
    
    // constructor khi đăng nhập 
    public FrameSinhVien(String mssv) {
        initComponents();
        this.mssv = mssv;
        JPanelMain.removeAll();
        JPanelMain.setLayout(new BorderLayout());
        JPanelMain.add(new ProfilePanel(mssv));      //mssv để xác định sinh viên khi vào frame    
        JPanelMain.validate();
        JPanelMain.repaint();
        jBProfile.setEnabled(false);   
    }

    // constructor khi xem bằng nhà quản lí
    public FrameSinhVien(String mssv, int flag) {
        initComponents();
        this.mssv = mssv;
        JPanelMain.removeAll();
        JPanelMain.setLayout(new BorderLayout());
        JPanelMain.add(new ProfilePanel(mssv));
        JPanelMain.validate();
        JPanelMain.repaint();
        jBProfile.setEnabled(false);
        jBLogOut.setVisible(false);             // bỏ đi tính năng logout
        
       
    }

    public FrameSinhVien() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPOption = new javax.swing.JPanel();
        jBProfile = new javax.swing.JButton();
        jBCourse = new javax.swing.JButton();
        jBGoal = new javax.swing.JButton();
        jBLO = new javax.swing.JButton();
        jBLogOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        JPanelMain = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sinh viên");
        setBackground(new java.awt.Color(44, 62, 80));

        jPOption.setBackground(new java.awt.Color(44, 62, 80));

        jBProfile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_profile.png"))); // NOI18N
        jBProfile.setText("Profile");
        jBProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBProfileActionPerformed(evt);
            }
        });

        jBCourse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_course.png"))); // NOI18N
        jBCourse.setText("Course");
        jBCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCourseActionPerformed(evt);
            }
        });

        jBGoal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBGoal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_goal.png"))); // NOI18N
        jBGoal.setText("Goal    ");
        jBGoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGoalActionPerformed(evt);
            }
        });

        jBLO.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBLO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_lo.png"))); // NOI18N
        jBLO.setText("Learning Outcome");
        jBLO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLOActionPerformed(evt);
            }
        });

        jBLogOut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_logout.png"))); // NOI18N
        jBLogOut.setText("Log Out");
        jBLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLogOutActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_uit.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPOptionLayout = new javax.swing.GroupLayout(jPOption);
        jPOption.setLayout(jPOptionLayout);
        jPOptionLayout.setHorizontalGroup(
            jPOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPOptionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPOptionLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPOptionLayout.createSequentialGroup()
                        .addGroup(jPOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBProfile, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBCourse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBGoal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBLO, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(jBLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPOptionLayout.setVerticalGroup(
            jPOptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPOptionLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jBCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jBGoal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jBLO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jBLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(297, Short.MAX_VALUE))
        );

        JPanelMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        JPanelMain.setPreferredSize(new java.awt.Dimension(1600, 4));
        JPanelMain.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout JPanelMainLayout = new javax.swing.GroupLayout(JPanelMain);
        JPanelMain.setLayout(JPanelMainLayout);
        JPanelMainLayout.setHorizontalGroup(
            JPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1559, Short.MAX_VALUE)
        );
        JPanelMainLayout.setVerticalGroup(
            JPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 796, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 1563, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPOption, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JPanelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Button Profile
    private void jBProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBProfileActionPerformed
        JPanelMain.removeAll();
        JPanelMain.setLayout(new BorderLayout());
        JPanelMain.add(new ProfilePanel(mssv));     //mở profile panel
        JPanelMain.validate();
        JPanelMain.repaint();
        jBProfile.setEnabled(false);
        jBCourse.setEnabled(true);
        jBGoal.setEnabled(true);
        jBLO.setEnabled(true);
    }//GEN-LAST:event_jBProfileActionPerformed

    //Button Logout
    private void jBLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLogOutActionPerformed
        this.dispose();                                // logout
        new LoginForm().setVisible(true);
    }//GEN-LAST:event_jBLogOutActionPerformed

    //Button Course
    private void jBCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCourseActionPerformed
        JPanelMain.removeAll();
        JPanelMain.setLayout(new BorderLayout());
        JPanelMain.add(new CoursePanel(mssv));                      // mở panel course
        JPanelMain.validate();
        JPanelMain.repaint();       
        jBProfile.setEnabled(true);
        jBCourse.setEnabled(false);
        jBGoal.setEnabled(true);
        jBLO.setEnabled(true);
    }//GEN-LAST:event_jBCourseActionPerformed

    //Button Learning Outcome
    private void jBLOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLOActionPerformed
        JPanelMain.removeAll();
        JPanelMain.setLayout(new BorderLayout());
        JPanelMain.add(new LOPanel(mssv));                  //mở panel LO
        JPanelMain.validate();
        JPanelMain.repaint();
        jBProfile.setEnabled(true);
        jBCourse.setEnabled(true);
        jBGoal.setEnabled(true);
        jBLO.setEnabled(false);
    }//GEN-LAST:event_jBLOActionPerformed

    //Button Goal
    private void jBGoalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGoalActionPerformed
        JPanelMain.removeAll();
        JPanelMain.setLayout(new BorderLayout());
        JPanelMain.add(new GPanel(mssv));                    //mở panel goal
        JPanelMain.validate();
        JPanelMain.repaint();
        jBProfile.setEnabled(true);
        jBCourse.setEnabled(true);
        jBGoal.setEnabled(false);
        jBLO.setEnabled(true);
    }//GEN-LAST:event_jBGoalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameSinhVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelMain;
    private javax.swing.JButton jBCourse;
    private javax.swing.JButton jBGoal;
    private javax.swing.JButton jBLO;
    private javax.swing.JButton jBLogOut;
    private javax.swing.JButton jBProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPOption;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}