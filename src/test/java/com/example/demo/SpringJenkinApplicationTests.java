package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinApplication.class);
	@Test
	public   contextLoads() {
		
		logger.info("TEST CASE eXECUTING .......");
		logger.info("Test case executing second log statement .......");
		
		assertEquals(true,true);
		
	}

}

