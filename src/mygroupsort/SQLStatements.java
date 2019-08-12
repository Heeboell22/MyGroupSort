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
        ResultSet queryResult = null;
        try {
            queryResult = executeSQLStatement("'select distinct class from Student'");
        } catch (SQLException e) {
            System.out.println("Bad SQL statement");
        } catch (ClassNotFoundException e) {
            System.out.println("Should not happen");
        }
        return parseClassesToList(queryResult);
    }

    private ResultSet executeSQLStatement(String sql) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/groupsort", "root", "Spiren22");
        Statement statement = con.createStatement();
        ResultSet queryResult = statement.executeQuery(sql);
        con.close();
        return queryResult;
    }

    private List<String> parseClassesToList(ResultSet classResult) {
        List<String> returnList = new ArrayList<String>();
        try {
            returnList.add(classResult.getString("class"));
            while (classResult.next()) {
                returnList.add(classResult.getString("class"));
            }
        } catch (SQLException e) {
            System.out.println("SQL Exception");
        }
        return returnList;
    }
}
