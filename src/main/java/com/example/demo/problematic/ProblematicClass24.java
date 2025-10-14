package com.example.demo.problematic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProblematicClass24 {
    public String dangerousOperation(String input) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT '" + input + "'");
            resultSet.next();
            String result = resultSet.getString(1);
            connection.close();
            return result;
        } catch (SQLException e) {
            return e.getMessage();
        }
    }
}
