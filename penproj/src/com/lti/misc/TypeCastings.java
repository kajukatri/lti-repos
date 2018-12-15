package com.lti.misc;

public class TypeCastings {
public static void main(String[] ag)
{
	int num,avg=0,summ=0;
	for(String x:ag)
	{
		num=Integer.parseInt(x);
		summ=summ+num;
		
	}
	avg=summ/(ag.length);
	System.out.println("average is"+avg);
	/*int sum=0;

	*/
	short a=10;
	short k=80;
	short dd=(short) (a+k);
	System.out.println("short is"+dd);
	String str1="Hello";
	
	
}
}
