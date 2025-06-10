package src.controllers;

import src.utils.DBConnection;

import java.sql.*;

public class AuthController {
    public static boolean authenticate(String username, String password) {
        String query = "SELECT * FROM admin WHERE username = ? AND password = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, username);
            stmt.setString(2, password); // NOTE: In production, hash the password

            ResultSet rs = stmt.executeQuery();
            return rs.next(); // if user found
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
            return false;
        }
    }
}
