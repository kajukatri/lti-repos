package com.test.threads;

public class TesterVol {
public static void main(String args[])
{
VolatileDemo	vdemo1=new VolatileDemo();
IncrThread t1=new IncrThread(vdemo1);
t1.start();
System.out.println(vdemo1.getX());
IncrThread t2=new IncrThread(vdemo1);
t2.start();
System.out.println(vdemo1.getX());
IncrThread t3=new IncrThread(vdemo1);
t3.start();
System.out.println(vdemo1.getX());
IncrThread t4=new IncrThread(vdemo1);
t4.start();
System.out.println(vdemo1.getX());
 DecrThread t5 =new DecrThread(vdemo1);
 t5.start();
 System.out.println(vdemo1.getX());
 DecrThread t6 =new DecrThread(vdemo1);
 t6.start();
 System.out.println(vdemo1.getX());
 DecrThread t7 =new DecrThread(vdemo1);
 t7.start();
 System.out.println(vdemo1.getX());
 DecrThread t8 =new DecrThread(vdemo1);
 t8.start();
 System.out.println(vdemo1.getX());
 
 
 
}
}
