package org.example;

import java.sql.*;
public class DatabaseConnection {
    private static Connection conn;

    private DatabaseConnection(){}

    public static Connection getCon() throws SQLException {
        if(conn == null){
            conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/itconsultant", "root", "");
        }
        return  conn;
    }

}
