package com.lti.misc;
import java.util.Scanner;
public class TestCal
{
public static void main(String[] args) {
/*Calculator c1=new Calculator();*/
Scanner sc=new Scanner(System.in);
	
	int a,b,output;
	System.out.println("enter num1");
	a=sc.nextInt();
	System.out.println("enter num2");
	b=sc.nextInt();
Calculator c=Calculator.getInstance();
Calculator c1=Calculator.getInstance();
	
	
output=c1.add(a, b);
System.out.println("Addition res"+output);
output=c1.sub(a, b);
System.out.println("Subtraction res"+output);
output=c1.mul(a, b);
System.out.println("Multiplication res"+output);
output=c1.div(a, b);
System.out.println("Division res"+output);

Calculator c3=Calculator.getInstance();
c3.add();
c3.sub();

Calculator c4= Calculator.getInstance();
c4.setNum1(45);
c4.setNum2(67);
System.out.println(c4.add());
System.out.println(c4.sub());

Calculator c5= Calculator.getInstance();
System.out.println("enter num1");
c4.setNum1(sc.nextInt());
System.out.println("enter num2");
c4.setNum2(sc.nextInt());
System.out.println(c4.add());
System.out.println(c4.sub());
sc.close();
}
}
