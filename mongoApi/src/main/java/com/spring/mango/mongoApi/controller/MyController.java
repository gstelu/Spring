package com.spring.mango.mongoApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mango.mongoApi.Entity.Employe;
import com.spring.mango.mongoApi.Service.EmployeService;

@RestController
	@RequestMapping("/employes")
	public class MyController {
		@Autowired
		private EmployeService employeService;
	  @PostMapping("/employes")
	 public ResponseEntity<?> addEmploye(@RequestBody Employe employe){
		  Employe save=this.employeService.save(employe);
		  return ResponseEntity.ok(save);	
	}
	  @GetMapping("/employes")
	  public ResponseEntity<?> getEmployes(){
	 	  return ResponseEntity.ok(this.employeService.findAll());	
	 }
	}

