package org.example;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        User u1  = DatabaseManager.getUser("Malek",145);
        System.out.print(u1 != null ? u1 :"");


    }
}