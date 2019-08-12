/*
 * 
The Sorting:
1. Handeling the excluding exceptions

Set up the number of grups as Arrays 

    Case 1: by placing each of the students in a seperate array. 
if : Condition:There HAS to be a higher or equal number of 'study-groups' to the largest 'exception-group'.
else: Give an 'error message'.

To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygroupsort;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 * Inger Heebøll Gemzøe
 */
public class MyGroupSort {

    public static void main(String[] args) throws SQLException {
        MyGroupSort pro = new MyGroupSort();
        pro.createConnection();
        SQLStatements sql = new SQLStatements();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ClassSortingFrame classFrame = new ClassSortingFrame();
                //classFrame.addClassesToClassNameBox(sql.RetrieveClasses());
                classFrame.setVisible(true);
            }
        });
    }

    void createConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/groupsort", "root", "Spiren22");
            Statement stmt = con.createStatement();
            
            {
                /* ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENT");
            while (rs.next() ){
               int student_id = rs.getInt("Student_id");
               String student_name = rs.getString("Student_name");
               String Class = rs.getString("class");
               System.out.println(student_id + " " + " " + student_name + " " + Class  );
                 */
                //stmt.executeUpdate("INSERT INTO STUDENT (STUDENT_NAME, CLASS) VALUES ('Tenna', '2Y')");
            }

            System.out.println("Connection to database was a succes");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyGroupSort.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MyGroupSort.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
