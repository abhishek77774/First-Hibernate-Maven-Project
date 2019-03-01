package com.cts.mngt.dao;
import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.cts.mngt.bean.Employee;
import com.cts.mngt.util.HibernateUtil;

public class EmployeeDAOImpl implements EmployeeDAO {
	
private static EmployeeDAOImpl employeeDAOImpl = null;
	
	public static EmployeeDAOImpl getInstance()
	{
		if(employeeDAOImpl == null)
			employeeDAOImpl = new EmployeeDAOImpl();
		return employeeDAOImpl;
	}
	
	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	@Override
	public String addEmployee(Employee employee) {
		Session session  = null;
		Transaction transaction  = null;
		try
		{
		session = sessionFactory.openSession();
		transaction = session.getTransaction();
		transaction.begin();
		session.save(employee);
		transaction.commit();
		return "success";
		}
		catch(Exception e)
		{
			if(transaction!=null)
			{
				transaction.rollback();
			}
			e.printStackTrace();
		}
		finally
		{
			if(session!=null)
			{
				session.close();
			}
		}
		
		
		return "failed";
		
	}

	@Override
	public String updateEmployee(int id, Employee employee) {
		
		return "fail";
	}

	@Override
	public String deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployee(int id) {
		
		return null;
		
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
