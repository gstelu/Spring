package com.springrest1.springrest1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest1.springrest1.entities.Employe;
@Service
public class EmployeServiceImpl implements EmployeService {
	
	List<Employe> list;
	public EmployeServiceImpl() {
		list=new ArrayList<>();
		list.add(new Employe(1,"vinay","ftd"));
		list.add(new Employe(2,"santu","ftd"));
	}
	
	

	@Override
	public List<Employe> getEmployes() {
		
		return list;
	}
	
	public Employe getEmploye(long id)
	{
		Employe c=null;
		for(Employe employe:list) {
			if(id==employe.getId()) {
				c=employe;
				break;
			}
		}
	
	return c;

}
	public Employe addEmploye(Employe employe) {
		list.add(employe);
		return employe;
		
	}
}
