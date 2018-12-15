
package com.lti.model;


public class Book {
public static void main(String args[])
{
	System.out.println("The book object is created");
	Booktype b1=new Booktype();
	b1.setId(1);
	b1.setTitle("Manipur");
	b1.setAuthor("Sri");
	//b1.setDate(07 Jan 2015);
	System.out.println(b1);
	Booktype b2=new Booktype(2,"Hobbit","James");
	System.out.println(b2);
	System.out.println("No. of book objects"+Booktype.getCtr());
	
	Booktype bkarr[]= new Booktype[5];
	for(int i=0;i<bkarr.length;i++)
	{
		bkarr[i]=new Booktype();
		}
		bkarr[0].setId(1234);
		bkarr[0].setTitle("Ramayan");
		bkarr[0].setAuthor("Ram");
		System.out.println(bkarr[0]);
		
		
	}
}



