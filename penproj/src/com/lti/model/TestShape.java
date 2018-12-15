package com.lti.model;

import java.util.Scanner;

public class TestShape {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
Shape shape=null;
System.out.println("enter the shape to b drawn");
System.out.println("1.Equi");
System.out.println("2.iso");
System.out.println("3.square");
int choice=sc.nextInt();
switch(choice)
{
case 1: 
shape = new Equilateral();
break;
case 2: 
shape = new Isotri();
break;
case 3: 
shape = new Square();
break;
default:System.out.println("invalid shape");
}
drawShape(shape);}
public static void drawShape(Shape s)
{
	s.draw();
	s.calArea();
	s.calVol();
	
}
}
