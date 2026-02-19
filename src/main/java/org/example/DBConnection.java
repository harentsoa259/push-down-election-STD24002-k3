package org.example;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    String url = "jdbc:postgresql://localhost:5432/election";
    String user = "postgres";
    String password = "harentsoa";

    public Connection getConnection() {
        try{
            return DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
