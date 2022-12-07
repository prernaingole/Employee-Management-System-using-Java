package com.ml.jdbc.pojo;

public class Employee 
{
	private int emp_id;
	private String emp_name;
	private int emp_age;
	private String emp_loc;
	
	public Employee() {
		super();
	}

	public Employee(int emp_id, String emp_name, int emp_age, String emp_loc) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_age = emp_age;
		this.emp_loc = emp_loc;
	}

	public Employee(String emp_name, int emp_age, String emp_loc) {
		super();
		this.emp_name = emp_name;
		this.emp_age = emp_age;
		this.emp_loc = emp_loc;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public int getEmp_age() {
		return emp_age;
	}

	public void setEmp_age(int emp_age) {
		this.emp_age = emp_age;
	}

	public String getEmp_loc() {
		return emp_loc;
	}

	public void setEmp_loc(String emp_loc) {
		this.emp_loc = emp_loc;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_age=" + emp_age + ", emp_loc=" + emp_loc
				+ "]";
	}
	
}
