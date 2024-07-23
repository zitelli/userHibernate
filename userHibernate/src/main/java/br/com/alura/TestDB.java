package br.com.alura;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestDB {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/camel?serverTimezone=UTC";
        String user = "root";
        String password = ""; // Update with your actual password

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String sql = "SELECT * FROM User WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setLong(1, 1);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                System.out.println("User found: " + rs.getString("name"));
            } else {
                System.out.println("User not found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
