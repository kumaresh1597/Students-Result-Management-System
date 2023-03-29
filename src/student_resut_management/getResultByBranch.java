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
import net.proteanit.sql.DbUtils;

/**
 *
 * @author HANIFA
 */
public class getResultByBranch extends javax.swing.JFrame {

    /**
     * Creates new form getResultByBranch
     */
    public getResultByBranch() {
        initComponents();
    }
    
    public getResultByBranch(String course,String branch) {
        initComponents();
        jTextField1.setText(course);
        jTextField2.setText(branch);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        NewStudent2 = new javax.swing.JButton();
        InsertResults2 = new javax.swing.JButton();
        registeredStudents2 = new javax.swing.JButton();
        allStudents3 = new javax.swing.JButton();
        Logout2 = new javax.swing.JButton();
        allStudents4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

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

        allStudents3.setBackground(new java.awt.Color(255, 153, 0));
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
        Logout2.setForeground(new java.awt.Color(51, 51, 51));
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
                .addComponent(Logout2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("Course Name");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("Branch Name");

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 204, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Back");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(43, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        String course = jTextField1.getText();
        String branch = jTextField2.getText();
        
        try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsResultManagement", "root","123456789root");
          Statement st = con.createStatement();
          
          if(branch.equals("IT")){
              ResultSet rs = st.executeQuery("select * from btechIt");
              jTable1.setModel(DbUtils.resultSetToTableModel(rs));
          }
          if(branch.equals("CSE")){
              ResultSet rs = st.executeQuery("Select * from btechCse");
              jTable1.setModel(DbUtils.resultSetToTableModel(rs));
          }
          if(branch.equals("MECH")){
              ResultSet rs = st.executeQuery("Select * from beMech");
              jTable1.setModel(DbUtils.resultSetToTableModel(rs));
          }
          if(branch.equals("CIVIL")){
              ResultSet rs = st.executeQuery("Select * from beCivil");
              jTable1.setModel(DbUtils.resultSetToTableModel(rs));
          }
          if(branch.equals("EEE")){
              ResultSet rs = st.executeQuery("Select * from beEee");
              jTable1.setModel(DbUtils.resultSetToTableModel(rs));
          }
          if(course.equals("MBA")){
              ResultSet rs = st.executeQuery("Select * from mba");
              jTable1.setModel(DbUtils.resultSetToTableModel(rs));
          }
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(rootPane,e.toString());
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new getAllResults().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(getResultByBranch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(getResultByBranch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(getResultByBranch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(getResultByBranch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new getResultByBranch().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton registeredStudents2;
    // End of variables declaration//GEN-END:variables
}
