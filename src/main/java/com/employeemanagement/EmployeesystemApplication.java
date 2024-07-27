package com.employeemanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeesystemApplication {
	 private static final Logger logger = LoggerFactory.getLogger(EmployeesystemApplication.class);
	   
	public static void main(String[] args) {
		SpringApplication.run(EmployeesystemApplication.class, args);
		System.out.println("execution success....!!!");
		logger.info("executing success wih logger");
		
	}

}
