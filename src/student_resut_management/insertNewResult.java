/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student_resut_management;

/**
 *
 * @author HANIFA
 */
public class insertNewResult extends javax.swing.JFrame {

    /**
     * Creates new form insertNewResult
     */
    public insertNewResult() {
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        NewStudent2 = new javax.swing.JButton();
        InsertResults2 = new javax.swing.JButton();
        registeredStudents2 = new javax.swing.JButton();
        allStudents3 = new javax.swing.JButton();
        Logout2 = new javax.swing.JButton();
        allStudents4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "BTECH", "BE", "MBA" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 163, 153, 28));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 230, 153, 29));

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Submit");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 311, 88, 32));

        back.setBackground(new java.awt.Color(255, 153, 0));
        back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        back.setText("Back");
        back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 311, 72, 32));

        jPanel5.setBackground(new java.awt.Color(0, 51, 204));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        NewStudent2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NewStudent2.setText("Add New Student");
        NewStudent2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        NewStudent2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewStudent2ActionPerformed(evt);
            }
        });

        InsertResults2.setBackground(new java.awt.Color(255, 204, 0));
        InsertResults2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        InsertResults2.setText("Insert New Results");
        InsertResults2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        InsertResults2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertResults2ActionPerformed(evt);
            }
        });

        registeredStudents2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        registeredStudents2.setText("Registered Students");
        registeredStudents2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        registeredStudents2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registeredStudents2ActionPerformed(evt);
            }
        });

        allStudents3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        allStudents3.setText("All Students Record");
        allStudents3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        allStudents3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allStudents3ActionPerformed(evt);
            }
        });

        Logout2.setBackground(new java.awt.Color(255, 51, 51));
        Logout2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Logout2.setText("Log out");
        Logout2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Logout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout2ActionPerformed(evt);
            }
        });

        allStudents4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        allStudents4.setText("Update Results");
        allStudents4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        allStudents4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allStudents4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NewStudent2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(InsertResults2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(registeredStudents2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
            .addComponent(allStudents3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(allStudents4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(Logout2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(NewStudent2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(InsertResults2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(allStudents4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(registeredStudents2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(allStudents3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(Logout2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Branch");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("Course Name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 370, 280));

        jPanel3.setBackground(new java.awt.Color(0, 51, 204));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INSERT RESULT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(183, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(405, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 540, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String course = (String)jComboBox1.getSelectedItem();
        String branch = (String)jComboBox2.getSelectedItem();
        
        if(course.equals("BTECH") && branch.equals("IT")){
            setVisible(false);
            new btechIt().setVisible(true);
        }
        if(course.equals("BTECH") && branch.equals("CSE")){
            setVisible(false);
            new btechCse().setVisible(true);
        }
        if(course.equals("BE") && branch.equals("MECH")){
            setVisible(false);
            new beMech().setVisible(true);
        }
        if(course.equals("BE") && branch.equals("CIVIL")){
            setVisible(false);
            new beCivil().setVisible(true);
        }
        if(course.equals("BE") && branch.equals("EEE")){
            setVisible(false);
            new beEee().setVisible(true);
        }
        if(course.equals("MBA")){
            setVisible(false);
            new mba().setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String course = (String)jComboBox1.getSelectedItem();
        if(course.equals("MBA")){
        jComboBox2.setEnabled(false);
        }
        if(course.equals("BTECH")){
        jComboBox2.setEnabled(true);
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "IT", "CSE"}));
        } 
        if(course.equals("BE")){
        jComboBox2.setEnabled(true);
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "MECH", "CIVIL","EEE"}));
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new adminWork().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void NewStudent2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewStudent2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new addNewStudent().setVisible(true);
    }//GEN-LAST:event_NewStudent2ActionPerformed

    private void InsertResults2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertResults2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new insertNewResult().setVisible(true);
    }//GEN-LAST:event_InsertResults2ActionPerformed

    private void registeredStudents2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registeredStudents2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new getAllStudents().setVisible(true);
    }//GEN-LAST:event_registeredStudents2ActionPerformed

    private void allStudents3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allStudents3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new getAllResults().setVisible(true);
    }//GEN-LAST:event_allStudents3ActionPerformed

    private void Logout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new AdminHome().setVisible(true);
    }//GEN-LAST:event_Logout2ActionPerformed

    private void allStudents4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allStudents4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new updateResult().setVisible(true);
    }//GEN-LAST:event_allStudents4ActionPerformed

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
            java.util.logging.Logger.getLogger(insertNewResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insertNewResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insertNewResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insertNewResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insertNewResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InsertResults2;
    private javax.swing.JButton Logout2;
    private javax.swing.JButton NewStudent2;
    private javax.swing.JButton allStudents3;
    private javax.swing.JButton allStudents4;
    private javax.swing.JButton back;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton registeredStudents2;
    // End of variables declaration//GEN-END:variables
}
