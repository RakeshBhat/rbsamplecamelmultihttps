package com.rbsamplecamelmultihttpsServerA;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)

public class TestServerAController {

	@Autowired
	TestRestTemplate testRestTemplate;
	
	@Test
	public void testSaveEmployee(){
		Employee emp = new Employee();
		emp.setId("111");
		emp.setName("JGD");
		emp.setPost("BOSS");
		emp.setJobDsc("Everything");
		emp.setSalary("dollars");
		
		ResponseEntity<String> res = testRestTemplate.postForEntity("/server/api/employee", emp, String.class, new Object());
		assertEquals("Saved Employee", res.getBody());
	}
}
