package myapp.controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseCon {
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abhishekdb", "root", "Abhishek@123");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
