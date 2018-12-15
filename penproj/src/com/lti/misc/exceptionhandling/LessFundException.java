package com.lti.misc.exceptionhandling;

public class LessFundException extends Exception{
private String msg;

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}

public LessFundException(String msg) {
	this.msg = msg;
	System.out.println(msg);
}

}
