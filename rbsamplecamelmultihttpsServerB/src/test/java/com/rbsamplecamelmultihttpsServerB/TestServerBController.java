package com.rbsamplecamelmultihttpsServerB;

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
public class TestServerBController {

	@Autowired
	TestRestTemplate testRestTemplate;
	
	@Test
	public void testSaveCustomer(){
		Customer emp = new Customer();
		emp.setId("111");
		emp.setName("JGD");
		emp.setGender("M");
		emp.setDob("12011961");
		emp.setAddress("delhi");
		emp.setLastSale("cookiessss");
		emp.setRating("Z");
		
		ResponseEntity<String> res = testRestTemplate.postForEntity("/server/api/customer", emp, String.class, new Object());
		assertEquals("Saved Customer", res.getBody());
	}
}
