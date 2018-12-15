package com.lti.model;

import java.util.Scanner;

public class Triangle extends TwoDShape {
	Scanner sc=new Scanner(System.in);
Triangle()
{
this.numofsides=3;
System.out.println("enter base");
this.breadth=sc.nextInt();
System.out.println("enter height");
this.length=sc.nextInt();
System.out.println("area"+calArea());
System.out.println("volume"+calVol());
}
public float calArea(){
	return (float) (0.5*this.length*this.breadth);
	
}
public float calVol(){
	return (float) ((3.14*this.breadth*this.length*this.breadth)/3);
	
}
@Override
public void color() {
	System.out.println("tri color");
}


public void outline() {

	System.out.println("tri outline");
}

public void shadow() {
	System.out.println("tri shadow");
}


}
