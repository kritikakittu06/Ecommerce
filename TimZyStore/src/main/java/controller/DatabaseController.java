package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseController {
	//method to get connection to the database
		public Connection getConnection() throws SQLException, ClassNotFoundException{
			Class.forName("com.mysql.cj.jbdc.Driver");
			String url = "jbdc:mysql://localhost3306/timzystore";
			String user = "root";
			String password = "";
			return DriverManager.getConnection(url, user, password);
		}



}
