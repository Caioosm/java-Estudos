package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
// import java.sql.ResultSet;
import java.sql.SQLException;
// import java.sql.Statement;
// import java.text.ParseException;
// import java.text.SimpleDateFormat;

import db.DB5;
import db.DbIntegrityException;

public class ProgramDB5 {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DB5.getConnection();

            preparedStatement = connection.prepareStatement(
                "DELETE FROM department "
                + "WHERE "
                + "Id = ?"
            );

            preparedStatement.setInt(1, 5);
            int rowsAffected = preparedStatement.executeUpdate();

            System.out.println("Done! rows affected: " + rowsAffected);
        } 
        catch (SQLException e) {
            throw new DbIntegrityException(e.getMessage());
        }
        finally{
            DB5.closeStatemnet(preparedStatement);
            DB5.closeConnection();
        }
    }
}
