package app;

import java.sql.Connection;
import java.sql.Statement;
// import java.sql.ResultSet;
import java.sql.SQLException;
// import java.sql.Statement;
// import java.text.ParseException;
// import java.text.SimpleDateFormat;

import db.DB5;
import db.DbException6;

public class ProgramDB6 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement st = null;

        try {
            connection = DB5.getConnection();

            connection.setAutoCommit(false);

            st = connection.createStatement();

            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
            
            // int x = 1;
            // if (x < 2) {
            //     throw new SQLException("Fake error");
            // }
            
            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            connection.commit();

            System.out.println("rows1: " + rows1);
            System.out.println("rows2: " + rows2);
        } 
        catch (SQLException e) {
            try {
                connection.rollback();
                throw new DbException6("Transaction rolled back! Caused by: " + e.getMessage());
            } catch (SQLException e1) {
                throw new DbException6("Error trying to rollback! Caused by: " + e1.getMessage());
            }
        }
        finally{
            DB5.closeStatemnet(st);


            DB5.closeConnection();
        }
    }
}
