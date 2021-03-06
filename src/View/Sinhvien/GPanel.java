/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Sinhvien;

import Controler.GoalController;

/**
 *
 * @author LENOVO
 */
public class GPanel extends javax.swing.JPanel {

    /**
     * Creates new form GPanel
     */
    
    public String mssv;
    
    public GPanel(String mssv) {
        initComponents();
        this.mssv = mssv;
        jLbG1.setVisible(false);
        jLbG2.setVisible(false);
        jLbG3.setVisible(false);              //ẩn các label , khi vào controller sẽ hiện lên
        jLbG4.setVisible(false);
        GoalController controller = new GoalController(this.mssv, this, jCBMon, jBXem, jLb1, jLb2, jLb3, jLb4, jLbG1, jLbG2, jLbG3, jLbG4);   //gọi goal controller
        controller.setEvent(); 
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
        jCBMon = new javax.swing.JComboBox<>();
        jBXem = new javax.swing.JButton();
        jLbG1 = new javax.swing.JLabel();
        jLbG2 = new javax.swing.JLabel();
        jLbG3 = new javax.swing.JLabel();
        jLbG4 = new javax.swing.JLabel();
        jLb1 = new javax.swing.JLabel();
        jLb2 = new javax.swing.JLabel();
        jLb3 = new javax.swing.JLabel();
        jLb4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(44, 62, 80));
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Chuẩn đầu ra (Goal) của môn học");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Chọn môn học : ");

        jCBMon.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jCBMon.setForeground(new java.awt.Color(0, 0, 0));
        jCBMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMonActionPerformed(evt);
            }
        });

        jBXem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jBXem.setForeground(new java.awt.Color(0, 0, 0));
        jBXem.setText("Xem chuẩn đầu ra");

        jLbG1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLbG1.setForeground(new java.awt.Color(255, 255, 255));
        jLbG1.setText("G1: ");

        jLbG2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLbG2.setForeground(new java.awt.Color(255, 255, 255));
        jLbG2.setText("G2: ");

        jLbG3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLbG3.setForeground(new java.awt.Color(255, 255, 255));
        jLbG3.setText("G3: ");

        jLbG4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLbG4.setForeground(new java.awt.Color(255, 255, 255));
        jLbG4.setText("G4: ");

        jLb1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLb1.setForeground(new java.awt.Color(255, 255, 255));
        jLb1.setText(" ");

        jLb2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLb2.setForeground(new java.awt.Color(255, 255, 255));
        jLb2.setText(" ");

        jLb3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLb3.setForeground(new java.awt.Color(255, 255, 255));
        jLb3.setText(" ");

        jLb4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLb4.setForeground(new java.awt.Color(255, 255, 255));
        jLb4.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(175, 175, 175)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCBMon, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(175, 175, 175)
                                .addComponent(jBXem)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLbG1)
                            .addComponent(jLbG2)
                            .addComponent(jLbG3)
                            .addComponent(jLbG4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLb1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLb2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLb3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLb4, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE))
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBXem))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbG1)
                    .addComponent(jLb1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbG2)
                    .addComponent(jLb2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLbG3)
                    .addComponent(jLb3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLbG4)
                    .addComponent(jLb4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(196, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCBMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBMonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBXem;
    private javax.swing.JComboBox<String> jCBMon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLb1;
    private javax.swing.JLabel jLb2;
    private javax.swing.JLabel jLb3;
    private javax.swing.JLabel jLb4;
    private javax.swing.JLabel jLbG1;
    private javax.swing.JLabel jLbG2;
    private javax.swing.JLabel jLbG3;
    private javax.swing.JLabel jLbG4;
    // End of variables declaration//GEN-END:variables
}
