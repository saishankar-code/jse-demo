package com.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersistTable {

	public static void main(String[] args) throws SQLException {
		
		//inserquery
		
		//insert into employee values(1,'Sai',100000,'male','it');
		
		String insertQuery = "insert into employee values(?,?,?,?,?)";
	
		
		//get the connection from db
		Connection connection =DBUtils.getDBConnection();
		
		for(int i=2;i<=100;i++) {
		PreparedStatement statement = connection.prepareStatement(insertQuery);
		
		statement.setInt(1, i);
		statement.setString(2, "Sai"+i);
		statement.setInt(3, 100000);
		
		statement.setString(4, "male");
		statement.setString(5, "it");
		
		statement.execute();
		}

	}

}
