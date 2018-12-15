package com.lti.model;

public class Equilateral extends Triangle implements Printable,Publishable{
public void draw()
{
System.out.println("drawing equi triangle");	
}


public void color() {
	System.out.println("equi color");
}


public void outline() {

	System.out.println("equi outline");
}

public void shadow() {
	System.out.println("equi shadow");
}



public void print() {
	System.out.println("print data..");
	
}



public void publish() {
	System.out.println("publish data...");
	
}

}
