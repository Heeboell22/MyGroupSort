/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygroupsort.PracticeBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mygroupsort.MyGroupSort;
import mygroupsort.SQLStatements;

/**
 *
 * @author Bruger
 */
public class ExperimentClass_RetrivingFromDatabase extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form ExperimentClass_RetrivingFromDatabase
     */
    public ExperimentClass_RetrivingFromDatabase() {
        initComponents();
    }
void createConnection() throws SQLException {
         
        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/groupsort", "root", "Spiren22");
         
            System.out.println("Connection to database was a succes");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyGroupSort.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MyGroupSort.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        SubjectNamejTextField = new javax.swing.JTextField();
        AddStudentjButton = new javax.swing.JButton();
        AllSubjectsjComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Subject name:");

        SubjectNamejTextField.setText("....");

        AddStudentjButton.setText("+Add Subject");
        AddStudentjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStudentjButtonActionPerformed(evt);
            }
        });

        AllSubjectsjComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        AllSubjectsjComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllSubjectsjComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AllSubjectsjComboBox1, 0, 120, Short.MAX_VALUE)
                    .addComponent(SubjectNamejTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddStudentjButton)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(SubjectNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddStudentjButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AllSubjectsjComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddStudentjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStudentjButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddStudentjButtonActionPerformed

    private void AllSubjectsjComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllSubjectsjComboBox1ActionPerformed

    }//GEN-LAST:event_AllSubjectsjComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {
       ExperimentClass_RetrivingFromDatabase pro = new ExperimentClass_RetrivingFromDatabase();
        pro.createConnection();
        SQLStatements sql = new SQLStatements();
        java.awt.EventQueue.invokeLater(new Runnable() {
                       public void run() {
                ExperimentClass_RetrivingFromDatabase subjectFrame = new ExperimentClass_RetrivingFromDatabase();
                subjectFrame.addSubjectsToAllSubjectsjComboBox1 (sql.RetrieveSubjects());
                subjectFrame.setVisible(true);
                       }
        });
        
                
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
            java.util.logging.Logger.getLogger(ExperimentClass_RetrivingFromDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExperimentClass_RetrivingFromDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExperimentClass_RetrivingFromDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExperimentClass_RetrivingFromDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExperimentClass_RetrivingFromDatabase().setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddStudentjButton;
    private javax.swing.JComboBox<String> AllSubjectsjComboBox1;
    private javax.swing.JTextField SubjectNamejTextField;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    private void addSubjectsToAllSubjectsjComboBox1(List<String> RetrieveSubjects) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}