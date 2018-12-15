package com.lti.misc;



import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunTestCalc {

	public static void main(String[] args) {
		Result result=JUnitCore.runClasses(TestCalculator.class);
	//	result.getFailures();
	List<Failure> failures=result.getFailures();
	System.out.println("list of failures");
	for(Failure failure:failures)
	{
		System.out.println(failures);
	}
	}

}
