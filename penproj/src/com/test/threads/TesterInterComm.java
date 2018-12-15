package com.test.threads;

import java.util.Scanner;

public class TesterInterComm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String p;
		System.out.println("Enter the message");
		p=sc.next();
dat data1=new dat(p);//can use scanner
dat data2=new dat("java multithreading");
Sender sender=new Sender(data1);
new Thread (sender,"sender").start();
Sender sender1=new Sender(data2);
new Thread (sender1,"sender1").start();
Receiver receiver=new Receiver(data1);
receiver.start();
sender1.start();
new Thread (receiver,"receiver").start();
System.out.println("All threads are started");
	}

}
