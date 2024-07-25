package com.employeemanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class EmpController {

	@GetMapping("msg")
	public String getMessage() {
		return "hello My dear Employee";
	}
}
