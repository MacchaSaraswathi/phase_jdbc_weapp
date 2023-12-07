package com.simplilearn.webapp.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
	// data source properties
			private final String DB_URL = "jdbc:mysql://localhost:3306/estore_zone_db";
			
			private final String DB_USL ="root";
			private final String DB_PAS ="Sirisanaino143@";
			
			Object connection = null;
			Object statement = null;
			Object rst = null;
			
	
	public void initConnection() {
		//step1 : Register a Driver (optional)
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		System.out.println("Register a Driver");
		//step2 : Create a Connection
		Object connection = DriverManager.getConnection(DB_URL, DB_USR, DB_PAS);
		System.out.println("create a connection");
		
		//step3 : create a statement
		Object statement = ((Connection) connection).createStatement();
		System.out.println("create a statement");
		//step4 : Execute Query
		String query = "select * from eproduct;";
		Object rst = statement.executeQuery(Query);
		System.out.println("Execute Query");
		
		//step5 : close connection
		rst.close();
		statement.close();
		connection.close;
		System.out.println("Close Connection");
		
	}catch (ClassNotFoundException e) {
		
		System.out.println("Exception Occured ::: "+e.getClass());
		
	}catch (SQLException e) {
		System.out.println("Exception Occured ::: "+e.getClass());
			
	}
	
	}
}
			
			
		
		
	
		
		
		
	


