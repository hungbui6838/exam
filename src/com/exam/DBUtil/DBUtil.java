package com.exam.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
    public static Connection getConnection() throws Exception {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //2. Create connection
            Connection conn
                    = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Contact","sa","12345678");

            return conn;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
