package com.lti.model;
import java.util.Scanner;
public class Test {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Employee e1=new Employee();
		e1.greeting();
		Employee e2=new Manager();
		e2.greeting();
		Employee e3=null;
		if(e1 instanceof Manager)
		{
		Manager m1=(Manager)e1;
		m1.greeting();
		}
		System.out.println("enter type of emp:");
		String typeofemp=sc.next();
		
		if(typeofemp.equals("Employee"))
		{
			e3= new Employee();
			
		}
		else if(typeofemp.equals("Manager"))
			{
				e3= new Manager();
				
			}
		
		CallGreeting(e3);
		//System.out.println("HIII BOSS!!");
	}
		public static void CallGreeting(Employee e)
		{
			//if(e instanceof Employee)
				e.greeting();
		
		}
	}
