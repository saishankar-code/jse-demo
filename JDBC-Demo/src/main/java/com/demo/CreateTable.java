package com.demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws SQLException {
		
		String sql ="create table employee(id int,name varchar(255),salary int,gender varchar(255),dept varchar(255))";
		
		//get connection from DB
		
		
		
	Connection connection=	DBUtils.getDBConnection();
	
	//get the statement from connection
	
	Statement statement =connection.createStatement();
	
	//execute query
	
	statement.execute(sql);

	}

}
