package db;

import java.sql.*;

public class Connector {

	private static Statement stmt;
	public static Connection con;
	

	public Connector() throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost/galgeleg?user=root&password=mvc23");
		stmt = con.createStatement();
	
	}

	public static void insertUser(User user) throws SQLException {
		stmt.executeUpdate("insert into USERS values('" + user.username + "', " + user.highscore + ")");
	}
	


	public static void main(String[] args) {
		try{
			Connector connection = new Connector();
			//connection.insertUser(new User("Børge", 10));
		}
		catch(Exception e){
			 System.out.println("Problem med database: "+e);
		      e.printStackTrace();
		}


	}
}