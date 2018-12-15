package com.test.threads;

public class IncrThread extends Thread {
VolatileDemo vdemo=new VolatileDemo();
public void run()
{vdemo.increment();

try {
Thread.sleep(1000);
	}
catch(InterruptedException ie){
	}
}
public IncrThread(VolatileDemo vdemo) {
	super();
	this.vdemo = vdemo;
}
}
