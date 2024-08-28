package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
// import java.text.ParseException;
// import java.text.SimpleDateFormat;

import db.DB3;

public class ProgramDB3 {
    public static void main(String[] args) {

        // SimpleDateFormat sfd = new SimpleDateFormat("dd/MM/yyyy");
        
        Connection connection = null;
        PreparedStatement prepStatement = null;

        try {
            connection = DB3.getConnection();

            // prepStatement = connection.prepareStatement(
            //     "INSERT INTO seller "
            //     + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
            //     + "VALUES "
            //     + "(?, ?, ?, ?, ?)",
            //     Statement.RETURN_GENERATED_KEYS
            // );

            // prepStatement.setString(1, "Carl Purple");
            // prepStatement.setString(2, "carlpurple@gmail.com");
            // prepStatement.setDate(3, new java.sql.Date(sfd.parse("22/09/1987").getTime()));
            // prepStatement.setDouble(4, 3000.00);
            // prepStatement.setInt(5, 4);

            prepStatement = connection.prepareStatement("insert into department (Name) values ('D1'),('D2')", Statement.RETURN_GENERATED_KEYS);

            int rowsAffected = prepStatement.executeUpdate();

            if (rowsAffected > 0) {
                ResultSet rs = prepStatement.getGeneratedKeys();
                while (rs.next()) {
                    int id = rs.getInt(1);
                    System.out.println("Done! ID = " + id);
                }
            }
            else{
                System.out.println("Nenhuma linha alterada!");
            }

        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        // catch(ParseException e){
        //     e.printStackTrace();
        // }
        finally{
            DB3.closeStatemnet(prepStatement);
            DB3.closeConnection();
        }
    }
}
