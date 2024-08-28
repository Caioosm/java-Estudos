package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
// import java.sql.ResultSet;
import java.sql.SQLException;
// import java.sql.Statement;
// import java.text.ParseException;
// import java.text.SimpleDateFormat;

import db.DB4;

public class ProgramDB4 {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DB4.getConnection();

            preparedStatement = connection.prepareStatement(
                "UPDATE seller "
                + "SET Email = ? "
                + "WHERE "
                + "(Id = ?)"
            );

            preparedStatement.setString(1, "junirsiulve@gmail.com");
            preparedStatement.setInt(2, 8);

            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println("Done! rows affected: " + rowsAffected);
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            DB4.closeStatemnet(preparedStatement);
            DB4.closeConnection();
        }
    }
}
