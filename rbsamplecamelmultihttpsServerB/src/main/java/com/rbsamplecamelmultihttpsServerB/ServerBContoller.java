package com.rbsamplecamelmultihttpsServerB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/server/api")
public class ServerBContoller {

	@Autowired
	private ServerBService service;
	
	@RequestMapping(value = "/customer", method = RequestMethod.POST, consumes = "application/json")
	public String saveEmployee(@RequestBody Customer cust){
		if(!service.isCustomerExists(cust)){
			service.saveCustomer(cust);
			return "Saved Customer";
		}
		return "Customer already exists.";
	}
}
