package app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB2;

public class ProgramDB2 {
    public static void main(String[] args) {
        
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;

        try {
            connection = DB2.getConnection();

            statement = connection.createStatement();

            rs = statement.executeQuery("select * from department");

            while (rs.next()) {
                System.out.println(rs.getInt("Id" ) + ", " + rs.getString("Name"));
            }
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            DB2.closeResultSet(rs);
            DB2.closeStatemnet(statement);
            DB2.closeConnection();
        }
    }
}
