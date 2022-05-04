package com.springapps.springjdbc.employee.dao;

import java.util.List;

import com.springapps.springjdbc.employee.dto.Employee;

public interface EmployeeDao {
	
	int create (Employee employee);
	
	// update employee set firstname=? lastname=? where id =? 
	int update(Employee employee);
	
	//delete from employee where id=?
	int delete(Employee employee);
	
	//read: select * from employee
	
	Employee read(int id);
	
	List<Employee> read();
}
