package com.test.threads;

public class DecrThread extends Thread {
	VolatileDemo vdemo1=new VolatileDemo();
	public void run()
	{vdemo1.decrement();
	
	try {
	Thread.sleep(1000);
		}
	catch(InterruptedException ie){
		
		}
	}
	public DecrThread(VolatileDemo vdemo1) {
		super();
		this.vdemo1 = vdemo1;
	}
}
