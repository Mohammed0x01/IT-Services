package org.example;

import java.sql.*;
public class DatabaseConnection {
    public static Connection conn;

    public static Connection getCon() throws SQLException {
        if(conn == null){
            conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/itconsultant", "root", "");
        }
        return  conn;
    }

}
