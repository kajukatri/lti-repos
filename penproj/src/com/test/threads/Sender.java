package com.test.threads;

public class Sender extends Thread{
	private dat data;
	
 Sender(dat data) {
	
		this.data = data;
	}

	public void run()
	{
		String nm=Thread.currentThread().getName();	

		synchronized(data)
		{
	
			System.out.println(nm+"Thread started");
	data.setMessage();
	System.out.println("messages is set and sent");
try {
	Thread.sleep(1000);
} catch (InterruptedException e) {

	e.printStackTrace();
	}
	data.notifyAll();
	System.out.println("notification sent to all the waiting threads");

	
		}
	
	}
	}


