package com.test.threads;

public class dat {
private String message;

public dat(String message) {
	super();
	this.message = message;
}

/*@Override
public String toString() {
	return "dat [message=" + message + "]";
}*/

public String getMessage() {
	return message;
}

public void setMessage() {
	System.out.println("msg is sent...");
}

}
