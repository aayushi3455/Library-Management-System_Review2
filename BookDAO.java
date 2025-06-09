package dao;
import model.Book;
import utils.DBConnection;
import java.sql.*;
import java.util.*;

public class BookDAO {
    public static List<Book> getAllBooks() {
        List<Book> books = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM books");
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Book b = new Book();
                b.setId(rs.getInt("id"));
                b.setTitle(rs.getString("title"));
                b.setAuthor(rs.getString("author"));
                b.setIsIssued(rs.getBoolean("is_issued"));
                books.add(b);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return books;
    }
}
