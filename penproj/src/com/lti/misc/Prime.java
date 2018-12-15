package com.lti.misc;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i =0;
	       int num =0;
	       int n;
	       //Empty String
	       String  primeNumbers = "";
	       System.out.println("enter num1");
			n=sc.nextInt();
	       for (i = 1; i <= n; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to "+n+" are :");
	       System.out.println(primeNumbers);

}}
