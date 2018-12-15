package com.lti.misc;

import java.util.Scanner;

public class AreaCircle {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	
	int a,output;
	System.out.println("enter num");
	a=sc.nextInt();
	output=fact(a);
	System.out.println("Result: "+output);
}
	public static int fact(int a)
	{
		int fact;
		if(a==0)
		fact=1;
		else
		fact=a*fact(a-1);
		return fact;
	}

}
