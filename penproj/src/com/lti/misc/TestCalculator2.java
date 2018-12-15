package com.lti.misc;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import org.junit.Test;
	import org.junit.runner.RunWith;
	import org.junit.runners.Parameterized;
	import org.junit.runners.Parameterized.Parameters;
	
	@RunWith(value=Parameterized.class)
	public class TestCalculator2 {
		Scanner sc= new Scanner(System.in);
		private String a,b;
	Calculator c=new Calculator();
	private long expected;
	private int value1;
	private int value2;
	@Parameters
	public static Collection data()
	{
		return
				Arrays.asList(new Object[][]
				{{-1,0,1},{0,5,5},{13,18,5},{0,17,17}});
	}
	
	public TestCalculator2(long expected,int value1,int value2)
	{
		this.expected=expected;
		this.value1=value1;
		this.value2=value2;
		
	}
	@Test
	public void m7() {
		assertEquals(expected,new Calculator().sub(value1,value2));
	}
}
