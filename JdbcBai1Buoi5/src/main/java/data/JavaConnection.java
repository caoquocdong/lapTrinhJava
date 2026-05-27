package data;

import java.sql.Connection;
import java.sql.DriverManager;

public class JavaConnection {

    public static Connection getConnection() {

        Connection conn = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/QuanLyKhoa",
                    "CaoQuocDong",
                    "206922AAbbcc.");

            System.out.println("Ket noi thanh cong");

        } catch(Exception e) {
            e.printStackTrace();
        }

        return conn;
    }
}