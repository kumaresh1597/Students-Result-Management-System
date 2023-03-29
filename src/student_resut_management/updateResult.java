/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student_resut_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author HANIFA
 */
public class updateResult extends javax.swing.JFrame {

    /**
     * Creates new form updateResult
     */
    public updateResult() {
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

        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        NewStudent2 = new javax.swing.JButton();
        InsertResults2 = new javax.swing.JButton();
        registeredStudents2 = new javax.swing.JButton();
        allStudents3 = new javax.swing.JButton();
        Logout2 = new javax.swing.JButton();
        allStudents4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Course Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 246, 111, 32));

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Search");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 363, 98, 33));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Branch");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 296, 78, 32));

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
        Logout2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Logout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout2ActionPerformed(evt);
            }
        });

        allStudents4.setBackground(new java.awt.Color(255, 204, 0));
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
                .addComponent(Logout2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jPanel3.setBackground(new java.awt.Color(0, 51, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Student Roll Number");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Scelect", "BTECH", "BE", "MBA" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel4.setText("Enter the Roll Number ");

        jButton2.setBackground(new java.awt.Color(255, 204, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Back");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("UPDATE RESULT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel6)
                .addGap(40, 40, 40)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 540, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String rollNo = jTextField1.getText();
        String course = (String)jComboBox1.getSelectedItem();
        String branch = (String)jComboBox2.getSelectedItem();
        
        try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsResultManagement", "root","123456789root");
          
          Statement st = con.createStatement();
          ResultSet rs = st.executeQuery("select * from students where RollNumber = '"+rollNo+"' and CourseName = '"+course+"' and Branch = '"+branch+"'");
          if(rs.next()){
             setVisible(false);
             new getUpdatePage(rollNo,course,branch).setVisible(true); 
          }
          else{
            JOptionPane.showMessageDialog(null, "Incorrect RollNumber or Branch Name Or Course Name");  
          }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String course = (String)jComboBox1.getSelectedItem();
        if(course.equals("MBA")){
        jComboBox2.setEnabled(true);
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"null"}));
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

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new adminWork().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(updateResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InsertResults2;
    private javax.swing.JButton Logout2;
    private javax.swing.JButton NewStudent2;
    private javax.swing.JButton allStudents3;
    private javax.swing.JButton allStudents4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton registeredStudents2;
    // End of variables declaration//GEN-END:variables
}
