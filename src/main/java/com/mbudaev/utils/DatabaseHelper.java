package com.mbudaev.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.List;

/**
 * Created by Mikhail_Budaev on 08-Jun-16.
 */
public class DatabaseHelper {
    private static DatabaseHelper instance = new DatabaseHelper();
    private PropertyLoader props = PropertyLoader.getInstance();

    public DatabaseHelper() {
    }

    public static DatabaseHelper getInstance() {
        return instance;
    }

    private String[] tables = props.getDataBaseTables();
    private String deleteQueryTemplate = "DELETE FROM %s";
    private String driverName = props.getDataBaseDriver();
    private String dbPath = props.getDataBasePath();
    private String jdbc = "jdbc:sqlite";
    private String dbUrl = jdbc + ":" + dbPath;
    int timeout = 30;


    public void clean() throws Exception {
        Class.forName(driverName);
        Connection conn = null;
        Statement stmt = null;
        try {
            conn = DriverManager.getConnection(dbUrl);
            stmt = conn.createStatement();
            stmt.setQueryTimeout(timeout);
            for (String table : tables) {
                stmt.executeUpdate(String.format(deleteQueryTemplate, table));
            }
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException e) {
                // do nothing
            }
            if (stmt != null)

            try {
                if (conn != null) conn.close();
            } catch (Exception ignore) {
            }
        }
    }

    public void scriptExecutor(File file) throws Exception {
        Class.forName(driverName);
        final Connection conn = DriverManager.getConnection(dbUrl);
        ScriptRunner runner = new ScriptRunner(conn, false, false);
        runner.runScript(new BufferedReader(new FileReader(file)));

////    importDataFromFile(File file){
//        List<String> lines = null;
//        try {
//            lines = Files.readAllLines(Paths.get("C:\\workspace\\test-task\\src\\main\\resource/TEST.SQL"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//       lines.stream().forEach(System.out::println);
    }
}
