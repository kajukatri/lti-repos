package com.lti.misc;

public class TestPerson {
public static void main(String args[])
{
	Person p1=new Person()
	{
		public void eat()
		{
			System.out.println("eat friuts");
		}
		public void sleep()
		{
			System.out.println("sleeps a lot");
			
		}
	};
	p1.eat();
	p1.sleep();
	
}
}
