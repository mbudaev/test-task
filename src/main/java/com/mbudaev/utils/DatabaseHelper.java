package com.mbudaev.utils;

import java.sql.*;

/**
 * Created by Mikhail_Budaev on 08-Jun-16.
 */
public class DatabaseHelper {
    private static DatabaseHelper instance = new DatabaseHelper();

    public DatabaseHelper() {
    }

    public static DatabaseHelper getInstance() {
        return instance;
    }

    private String[] tables = {"addresses", "clients", "loads", "orders"};
    private String deleteQueryTemplate = "DELETE FROM %s";
    private String driverName = "org.sqlite.JDBC";
    private String dbPath = "D:/Git/edu/DeliveryOrdersManager/db/development.sqlite3";
    private String jdbc = "jdbc:sqlite";
    private String dbUrl = jdbc + ":" + dbPath;
    int timeout = 30;


    public void clean() throws Exception {
        Class.forName(driverName);
        Connection conn = DriverManager.getConnection(dbUrl);
        try {
            Statement stmt = conn.createStatement();
            try {
                stmt.setQueryTimeout(timeout);
                for (String table : tables) {
                    stmt.executeUpdate(String.format(deleteQueryTemplate, table));
                }

            } finally {
                try {
                    stmt.close();
                } catch (Exception ignore) {
                }
            }
        } finally {
            try {
                conn.close();
            } catch (Exception ignore) {
            }
        }
    }
}
