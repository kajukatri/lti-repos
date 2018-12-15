package com.test.threads;

public class TesterRace {

	public static void main(String[] args) {
		/*Racer r1=new Racer(10);
		r1.start();
		Racer r2=new Racer(1);
		r2.start();
		*/
		Runnable runnable1=new RunnableRacer();
		Thread t1=new Thread(runnable1);
		t1.setName("racer");
		t1.setPriority(10);
		t1.start();
		Runnable runnable2=new RunnableRacer();
		Thread t2=new Thread(runnable2);
		t2.setName("racer2");
		t2.start();
		
		
		
		}
	
	

}
