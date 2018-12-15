package com.lti.misc;

import java.io.Serializable;

public class Address  implements Serializable{
private String Blgname;
private String streetname;
private String City;
private String pincode;



public Address(String blgname, String streetname, String city, String pincode) {
	super();
	Blgname = blgname;
	this.streetname = streetname;
	City = city;
	this.pincode = pincode;
}
public String getBlgname() {
	return Blgname;
}
public void setBlgname(String blgname) {
	Blgname = blgname;
}
public String getStreetname() {
	return streetname;
}
public void setStreetname(String streetname) {
	this.streetname = streetname;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Address [Buildgname=" + Blgname + ", streetname=" + streetname + ", Cityname=" + City + ", pincode="
			+ pincode + "]";
}

}
