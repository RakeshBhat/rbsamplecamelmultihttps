package com.rbsamplecamelmultihttpsServerB;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ServerBService {

	private Map<String, Customer> customers = new HashMap<String, Customer>();
	
	public void saveCustomer(Customer emp){
		customers.put(emp.getId(), emp);
	}
	
	public Customer getCustomer(Customer emp){
		return customers.get(emp.getId());
	}
	
	public void removeCustomer(Customer emp){
		customers.remove(emp.getId());
	}
	
	public boolean isCustomerExists(Customer emp){
		return this.getCustomer(emp) == null ? false : true;
	}
}
