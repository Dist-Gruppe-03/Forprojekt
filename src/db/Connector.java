package db;

import java.sql.*;

public class Connector {

	
	
        private static String serv = "sql7.freemysqlhosting.net";
        private static String port = "3306";
        private static String database = "sql7237298";
        private static String username = "sql7237298";
        private static String passw = "N3zKVTxn91";
        private static Connection con;


        public static Connection getConnection() throws ClassNotFoundException, SQLException {  
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                con = DriverManager.getConnection("jdbc:mysql://"+serv+":"+port+"/"+database,
				username, passw);
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println("Failed to create the database connection."); 
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println("Driver not found."); 
        }
        return con;
    }
        


	


}