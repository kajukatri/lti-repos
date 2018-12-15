package com.lti.model;

import java.util.Scanner;

public class Square extends TwoDShape {
	Scanner sc=new Scanner(System.in);
	
	public Square()
	{
		this.numofsides=4;
		System.out.println("enter side");
		this.breadth=sc.nextInt();
		System.out.println("area"+calArea());
		System.out.println("volume"+calVol());
	}

	
	public void color() {
		System.out.println("square color");
		
	}


	public void outline() {
		System.out.println("square outline");
		
	}

	
	public void shadow() {
		System.out.println("square shadow");
		
	}

	public float calArea(){
		return (float) (this.breadth*this.breadth);
		
	}
	public float calVol(){
		return (float) (this.breadth*this.breadth*this.breadth);
		
	}
	
}
