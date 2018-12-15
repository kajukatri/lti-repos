package com.lti.model;


public class Booktype {
	//static variables
	private static  int ctr=0;
	
	//instance variables
	private int id;
	private String title;
	private String author;
	Booktype()
	{
		
		ctr++;
		
	}
	Booktype(int id,String title,String author)
	{
		this.id=id;
		this.title=title;
		this.author=author;
		ctr++;	
	}
	Booktype(Booktype b)
	{
		this.id=b.id;
		this.title=b.title;
		this.author=b.author;
		
		ctr++;
	}
	
	//setter methods
	public void setId(int idd)
	{this.id=idd;
	}
	public void setTitle(String t)
	{
		this.title=t;
	}
	public void setAuthor(String a)
	{
		this.author=a;
	}
	
	
	//getter methods
	public int getId() {return this.id;}
	public String getTitle() {return this.title;}
	public String getAuthor() {return this.author;}
	
	
	//toString
	public String toString()
	{
		return "Id:" +this.id+"\n"+"Title :"+this.title+"\n"+"Author :"+this.author;
		
	}
	
	public static int getCtr()
	{
		return ctr;
		
	}
}

	
