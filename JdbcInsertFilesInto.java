package test;
 import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;
 
public class JdbcInsertFilesInto{
 
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/flowable";
        String user = "root";
        String password = "";
 
        String filePath = "D:/vibhu.txt";
        Statement stmt = null;
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            stmt = (Statement) conn.createStatement();
            String sql = "INSERT INTO registration " +
                    "VALUES (100, 'Zara', 'Ali', 18)";
            stmt.executeUpdate(sql);
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}