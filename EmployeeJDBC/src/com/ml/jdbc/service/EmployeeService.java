package com.ml.jdbc.service;

import java.util.Scanner;

import com.ml.jdbc.dao.EmployeeDAO;
import com.ml.jdbc.pojo.Employee;

public class EmployeeService implements IEmployeeService {

	Employee employee=null;
	EmployeeDAO dao=new EmployeeDAO();
	Scanner scanner=new Scanner(System.in);
	
	@Override
	public void insertEmployee() 
	{
		employee=new Employee();
		System.out.println("Kindly enter the employee details");
		System.out.println("Enter name, age and address");
		employee.setEmp_name(scanner.next());
		employee.setEmp_age(scanner.nextInt());
		employee.setEmp_loc(scanner.next());
		System.out.println(employee);
		//Employee employee=new Employee(scanner.next(),scanner.nextInt(),scanner.next());
		if((dao.insertEmployee(employee))>0)
		{
			System.out.println("Insert employee data was successfull....");
		}
		else
		{
			System.out.println("Sorry, adding employee was not successfull....");
		}
	}

}
