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
}
