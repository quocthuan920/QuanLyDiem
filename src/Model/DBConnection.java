package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {

    public static Connection getConnection() {
        try {
            Connection cons = null;
            cons = DriverManager.getConnection("jdbc:mysql://localhost:3306/doanjava", "root", "thuan920");
            return cons;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public static void main(String[] args) throws SQLException {
        Connection c = getConnection();
        c.close();
    }

}
