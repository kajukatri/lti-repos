package com.test.threads;

public class Receiver extends Thread{
dat data;
Receiver(dat data) {

	this.data = data;
}
public void run()
{

String nm=Thread.currentThread().getName();	
System.out.println(nm);
synchronized(data)
{
try {
	System.out.println("Waiting for the data");
	data.wait(1000);
	
} 
catch (InterruptedException e)
{
	System.out.println("Wait interrupted...");
}}
System.out.println("Received data");
System.out.println(data.getMessage());


}
}
