package com.springrest1.springrest1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest1.springrest1.entities.Employe;
import com.springrest1.springrest1.service.EmployeService;

@RestController
public class MyController {
	@Autowired
	private EmployeService employeservice;
	
	@GetMapping("/home")
public  String home() {
	return "welcome to employeee";
}
	//get courses
	@GetMapping("/employes")
	public List<Employe> getEmployes()
	{
		return this.employeservice.getEmployes();
	}
	@GetMapping("/employes/{id}")
	public Employe getEmploye(@PathVariable String id) {
		return this.employeservice.getEmploye(Long.parseLong(id));
	}
	
	@PostMapping("/employe" )
	public Employe addEmploye(@RequestBody Employe employe) {
		return this.employeservice.addEmploye(employe);
		
	}
}
