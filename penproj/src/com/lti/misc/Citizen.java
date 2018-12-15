package com.lti.misc;

import java.io.Serializable;
import java.time.LocalDate;

public class Citizen  extends Person  implements Serializable{
private String aadharId;
private String name;
private Address address;
private LocalDate dob;


	
	public Citizen(String aadharId, String name, Address address, LocalDate dob) {
	super();
	this.aadharId = aadharId;
	this.name = name;
	this.address = address;
	this.dob = dob;
}

	@Override
	public String toString() {
		return "Citizen [aadharId=" + aadharId + ", name=" + name + ", address=" + address + ", dob=" + dob + "]";
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

}
