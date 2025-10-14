package com.example.demo.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * A fake repository intentionally riddled with mistakes.
 */
public class LegacyJdbcRepository {

    private static final String CONNECTION = "jdbc:h2:mem:test;MODE=LEGACY";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password123"; // hardcoded credential

    public List<String> findByStatus(String status) {
        List<String> list = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection(CONNECTION, USERNAME, PASSWORD);
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT id FROM payments WHERE status = '" + status + "'");
            while (resultSet.next()) {
                list.add(resultSet.getString("id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ignored) {
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ignored) {
                }
            }
        }
        return list;
    }
}
