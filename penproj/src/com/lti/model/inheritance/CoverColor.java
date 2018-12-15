package com.lti.model.inheritance;

public enum CoverColor {
BLACK(1000,"Mum"),GOLDEN(100,"Chandigarh"),ROSE_PINK(50,"Pune"),WHITE(100,"Hyderabad");
	int numsManu;
	String city;
	CoverColor(int n, String city)
	{
		this.numsManu=n;
		this.city=city;
	}
	public int getNumsManu() {
		return numsManu;
	}
	public void setNumsManu(int numsManu) {
		this.numsManu = numsManu;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
		
}
