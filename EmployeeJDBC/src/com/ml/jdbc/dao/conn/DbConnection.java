package com.ml.jdbc.dao.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection 
{
	Connection con=null;
	
	public Connection getConnection()
	{
		try
		{
			//1.Load and register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2.Create and assign the value to connection object
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/millionlights","root","root");
			
		}
		catch (Exception e) 
		{
				e.printStackTrace();
		}

		
		return con;
	}
}
