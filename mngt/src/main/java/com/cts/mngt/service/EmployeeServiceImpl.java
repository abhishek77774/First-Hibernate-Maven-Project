package com.cts.mngt.service;

import java.util.List;

import com.cts.mngt.bean.Employee;
import com.cts.mngt.dao.EmployeeDAO;
import com.cts.mngt.dao.EmployeeDAOImpl;


public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDAO employeeDAO = EmployeeDAOImpl.getInstance();
	private static EmployeeServiceImpl employeeServiceImpl = null;

	public static EmployeeServiceImpl getInstance()
	{
		if(employeeServiceImpl == null)
			employeeServiceImpl = new EmployeeServiceImpl();
		return employeeServiceImpl;
	}
	
	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.addEmployee(employee);
	}

	@Override
	public String updateEmployee(int id, Employee employee) {
		// TODO Auto-generated method stub
		return employeeDAO.updateEmployee(id, employee);
	}

	@Override
	public String deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployee(int id) {
		return employeeDAO.getEmployee(id);
	}

	@Override
	public List<Employee> getEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
