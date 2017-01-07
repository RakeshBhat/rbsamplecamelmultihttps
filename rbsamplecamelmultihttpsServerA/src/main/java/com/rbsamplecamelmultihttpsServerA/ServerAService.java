package com.rbsamplecamelmultihttpsServerA;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ServerAService {

	private Map<String, Employee> employees = new HashMap<String, Employee>();
	
	public void saveEmployee(Employee emp){
		employees.put(emp.getId(), emp);
	}
	
	public Employee getEmployee(Employee emp){
		return employees.get(emp.getId());
	}
	
	public void removeEmployee(Employee emp){
		employees.remove(emp.getId());
	}
	
	public boolean isEmployeeExists(Employee emp){
		return this.getEmployee(emp) == null ? false : true;
	}
}
