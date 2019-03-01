package com.cts.mngt.main;

import com.cts.mngt.bean.Employee;
import com.cts.mngt.service.EmployeeService;
import com.cts.mngt.service.EmployeeServiceImpl;

public class Main {
	
	
	public static void main(String[] args)
	{
		EmployeeService employeeService = EmployeeServiceImpl.getInstance();
		Employee employee = new Employee(101, "Abhishek", "Sharma", 15000);
		employeeService.addEmployee(employee);
		System.out.println("Hello from main");
	}

}
