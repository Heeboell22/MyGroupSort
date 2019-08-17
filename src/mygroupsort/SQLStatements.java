/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygroupsort;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bruger
 */
public class SQLStatements {

    public List<String> RetrieveClasses() {
        List<String> queryList = null;
        try {
            queryList = executeSQLStatement("select distinct class from Student;");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return queryList;
    }

    private List<String> executeSQLStatement(String sql) throws SQLException, ClassNotFoundException {
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/groupsort", "root", "Spiren22");
        Statement statement = con.createStatement();
        List<String> queryResult = parseClassesToList(statement.executeQuery(sql));
        con.close();
        return queryResult;
    }

    private List<String> parseClassesToList(ResultSet classResult) {
        List<String> returnList = new ArrayList<String>();
        try {
            while (classResult.next()) {
                returnList.add(classResult.getString("class"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return returnList;
    }
    
     public List<String> RetrieveSubjects()  {
        List<String> queryList = null;
        try {
            queryList = executeSQLStatementSubject("select distinct Subject_name from subject;");
        } catch (SQLException e) {
            e.printStackTrace();
         } catch (ClassNotFoundException e) {
            e.printStackTrace();
         }
        return queryList;
    }
     
     
   private List<String> parseSubjectsToList(ResultSet classResult) {
        List<String> returnList = new ArrayList<String>();
        try {
            while (classResult.next()) {
                returnList.add(classResult.getString("Subject_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return returnList;
    }   
   
     private List<String> executeSQLStatementSubject(String sql) throws SQLException, ClassNotFoundException {
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/groupsort", "root", "Spiren22");
        Statement statement = con.createStatement();
        List<String> queryResult = parseSubjectsToList(statement.executeQuery(sql));
        con.close();
        return queryResult;
    }
     
     
     private List<String> executeSQLStatementStudentsInClass(String sql) throws SQLException, ClassNotFoundException {
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/groupsort", "root", "Spiren22");
        Statement statement = con.createStatement();
        List<String> queryResult = parseStudentNameToList(statement.executeQuery(sql));
        con.close();
        return queryResult;
    }
     
       private List<String> parseStudentNameToList(ResultSet classResult) {
        List<String> returnList = new ArrayList<String>();
        try {
            while (classResult.next()) {
                returnList.add(classResult.getString("Student_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return returnList;
    } 
       
           public List<String> RetrieveStudentNames(String Class) {
        List<String> queryList = null;
        try {
            queryList = executeSQLStatementStudentsInClass("select student_name from student inner join subject on student.student_id = Subject.student_id where student.class = '"+ Class + "';");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }        return queryList;
    }
}

