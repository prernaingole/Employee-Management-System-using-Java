package com.ml.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ml.jdbc.dao.conn.DbConnection;
import com.ml.jdbc.pojo.Employee;

public class EmployeeDAO implements IEmployeeDAO {

	String query="";
	Connection connection=new DbConnection().getConnection();
	int result=0;
	
	@Override
	public int insertEmployee(Employee employee) 
	{
		System.out.println("DAO--"+employee);
		try
		{
			//3. Preparing the SQL statement
			query="insert into employee(emp_name,emp_age,emp_loc) values(?,?,?);";
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1, employee.getEmp_name());
			preparedStatement.setInt(2,employee.getEmp_age());
			preparedStatement.setString(3, employee.getEmp_loc());
			System.out.println("After PS");
			result=preparedStatement.executeUpdate();
			return result;
			//System.out.println(result);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}

}
