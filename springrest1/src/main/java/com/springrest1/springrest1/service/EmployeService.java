package com.springrest1.springrest1.service;

import java.util.List;

import com.springrest1.springrest1.entities.Employe;

public interface EmployeService {
	
	public List<Employe> getEmployes();
	
	public Employe getEmploye(long id);
   
	public Employe addEmploye(Employe employe);
}
