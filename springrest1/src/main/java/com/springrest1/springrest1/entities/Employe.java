package com.springrest1.springrest1.entities;

public class Employe {
private long id;
private String name;
private String descr;
public Employe(long id, String name, String descr) {
	super();
	this.id = id;
	this.name = name;
	this.descr = descr;
}
public Employe() {
	super();
	// TODO Auto-generated constructor stub
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescr() {
	return descr;
}
public void setDescr(String descr) {
	this.descr = descr;
}
@Override
public String toString() {
	return "Employe [id=" + id + ", name=" + name + ", descr=" + descr + ", getId()=" + getId() + ", getName()="
			+ getName() + ", getDescr()=" + getDescr() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}

}
