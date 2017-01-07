package com.rbsamplecamelmultihttpsServerA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/server/api")
public class ServerAContoller {

	@Autowired
	private ServerAService service;
	
	@RequestMapping(value = "/employee", method = RequestMethod.POST, consumes = "application/json")
	public String saveEmployee(@RequestBody Employee emp){
		System.out.println("Received employee: "+ emp);
		if(!service.isEmployeeExists(emp)){
			service.saveEmployee(emp);
			return "Saved Employee";
		}
		return "Employee already exists.";
	}
}
