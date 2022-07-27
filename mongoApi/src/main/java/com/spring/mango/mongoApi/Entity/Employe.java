package com.spring.mango.mongoApi.Entity;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="employees")
public class Employe {
		
	    private int id;
	    private String name;
	    private long salary;
	    private String designation;
		public Employe(int id, String name, long salary, String designation) {
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.designation = designation;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getSalary() {
			return salary;
		}
		public void setSalary(long salary) {
			this.salary = salary;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
		}
	    
	}
