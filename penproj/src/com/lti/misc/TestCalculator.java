package com.lti.misc;

import static org.junit.Assert.*;


import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(value=Parameterized.class)
public class TestCalculator {
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
			{{1,0,1},{10,5,5},{23,18,5},{34,17,17}});
}

public TestCalculator(long expected,int value1,int value2)
{
	this.expected=expected;
	this.value1=value1;
	this.value2=value2;
	
}
@Test
public void m7() {
	assertEquals(expected,new Calculator().add(value1,value2));
}
@BeforeClass
public static void m1() {
	System.out.println("testing begins...");
}
@Before
public void m3() {
	System.out.println("before testing begins...unit level");
}
@After
public void m2() {
	System.out.println("after testing begins...");
}
@AfterClass
public static void m4() {
	System.out.println("testing ends...");
}
	@Test
	public void testAdd() {
		System.out.println("testing");
		assertEquals(10,c.add(5,5));
	}

	@Test
	public void testSub() {
		System.out.println("testing");
		assertEquals(0,c.sub(5,5));
	}


	@Test
	public void testMul() {
		System.out.println("testing");
		assertEquals(25,c.mul(5,5));
	}

	@Test
	public void testDiv() {
		System.out.println("testing");
		assertEquals(1,c.div(5,5));
	}

	
	
	
	@Test(timeout=10,expected=NullPointerException.class)
	public void test() {
		System.out.println("enter user:");
		a=sc.next();
		System.out.println("enter pass:");
		b=sc.next();
		assertEquals("admin",a);
		assertEquals("admin@123",b);
		System.out.println("welcome admin");
		if(a.equals(" "))
			throw new  NullPointerException();
	}
}
