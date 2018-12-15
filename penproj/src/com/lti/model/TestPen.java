package com.lti.model;

public class TestPen {
public static void main(String []a)
{
	Pen p1=new Pen();
	p1.setId(1);
	p1.setBrand("Rotomac");
	p1.setPrice(70.0f);
	p1.setColorOfInk("black");
	System.out.println(p1);
	Pen p2=new Pen(2,"Parker",200.0f,"blue");
	System.out.println(p2);
	System.out.println("No. of pen objects"+Pen.getCtr());
	
	Pen penarr[]=new Pen[3];
	for(int i=0;i<penarr.length;i++)
	{
	penarr[i]=new Pen();}
	penarr[0].setId(1234);
	penarr[0].setBrand("DW ");
	penarr[0].setPrice(567);
	penarr[0].setColorOfInk("black");
	System.out.println(penarr[0]);
	}
public void greet()
{
System.out.println("Hello World!!");
}}
