package com.cts.mngt.service;

import java.util.List;

import com.cts.mngt.bean.Employee;

public interface EmployeeService {

	public String addEmployee(Employee employee);
	public String updateEmployee(int i, Employee employee);
	public String deleteEmployee(int id);
	public Employee getEmployee(int id);
	public List<Employee> getEmployeeByName(String name);
	public List<Employee> getEmployees();
 
}
