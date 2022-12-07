package com.ml.jdbc.main;

import java.util.Scanner;

import com.ml.jdbc.pojo.Employee;
import com.ml.jdbc.service.EmployeeService;

public class EmployeeDemo 
{
	Employee employee=null;
	Scanner scanner=new Scanner(System.in);
	EmployeeService service=new EmployeeService();
	
	public EmployeeDemo() 
	{
		System.out.println("Welcome to EMS");
		System.out.println("Choose the operation which you wish to perform....");
		System.out.println("Your option:\n1.Add Employee\n2.Show all Employee\n3.Show Employee\n4.Update Employee\n5.Delete Employee");
		int option=scanner.nextInt();
		switch (option) 
		{
			case 1:
					service.insertEmployee();
				break;
	
			case 2:
				//service.getAllEmployee();
				break;
			default:
				break;
		}
	}
	public static void main(String[] args) 
	{
		new EmployeeDemo();
	}

}
