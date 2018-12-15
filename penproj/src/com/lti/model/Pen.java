package com.lti.model;

public class Pen {
	//static variables
	private static  int ctr=0;
	
	//instance variables
	private int id;
	private String brand;
	private float price;
	private String color_of_ink;
	
	private class InkChanger
	{
		String new_color;
		public InkChanger(String new_color)
		{
		super();
		this.new_color=new_color;
		}
		void changeInk()
		{color_of_ink=new_color;
			System.out.println("color changed to New Color..");}
		String getnewColor()
		{
			return new_color;}
	}
	
	//constructor
	Pen()
	{
		System.out.println("The pen object is created");
		ctr++;	}
	
	public Pen(int id,String brand,float price,String color_of_ink )
	{
		this.id=id;
		this.brand=brand;
		this.price=price;
		this.color_of_ink=color_of_ink;
		ctr++;	}
	
	Pen(Pen p)
	{
		this.id=p.id;
		this.brand=p.brand;
		this.price=p.price;
		this.color_of_ink=p.color_of_ink;
		ctr++;}
	
	//setter methods
	public void setId(int idd)
	{this.id=idd;
	}
	public void setBrand(String b)
	{this.brand=b;
	}
	public void setPrice(float p)
	{this.price=p;
	}
	public void setColorOfInk(String c)
	{this.color_of_ink=c;
	}
	
	//getter methods
	public int getId() {return this.id;}
	public String getBrand() {return this.brand;}
	public float getPrice() {return this.price;}
	public String getColorOfInk() {return this.color_of_ink;}
	
	//toString
	public String toString()
	{
		return "Id:" +this.id+"\n"+"Brand :"+this.brand+"\n"+"Price :"+this.price+"\n"+"Color :"+this.color_of_ink;}
	
	public static int getCtr()
	{
		return ctr;	}
	
	public static void main(String args[])
	{
	Pen p1=new Pen(1212,"Parker",4343,"blue");
	/*Pen.InkChanger	ink_changer=p1.new InkChanger("black");
	ink_changer.changeInk();
	System.out.println(p1);
		*/
		Pen.CountTracker counttracker=new CountTracker();
		counttracker.displayCounter();
	}
	
	static class CountTracker
	{static void displayCounter()
		{
		System.out.println(ctr);
		}
		public static void main(String args[])
		{System.out.println("no of obj created are");
		displayCounter();
		}
	}
	//behaviour or methods
	public void setBrand()
	{
	String brandname="Reynolds";
	this.brand= brandname;	
	System.out.println("the brand is "+this.brand);}

}
