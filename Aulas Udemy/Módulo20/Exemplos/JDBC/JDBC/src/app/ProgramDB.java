package app;

import java.sql.Connection;

import db.DB;

public class ProgramDB {
    public static void main(String[] args) throws Exception {
        Connection connection = DB.getConnection();
        DB.closeConnection();
    }
}
