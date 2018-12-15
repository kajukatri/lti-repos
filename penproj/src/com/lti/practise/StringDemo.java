package com.lti.practise;

import java.util.StringTokenizer;

public class StringDemo {

	public static void main(String[] args) {
		StringBuilder sb1=new StringBuilder();
		sb1.append("This is a new string");
		System.out.println(sb1.length()+"length");
		System.out.println(sb1.capacity()+"capacity");
		sb1.ensureCapacity(100);
		System.out.println(sb1.capacity());
		System.out.println(sb1.charAt(11));
		sb1.replace(0, 10, "hello");
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		System.out.println(sb1.substring(5,11));
		
		String names="disha puja heena sami tina nitin";
		StringTokenizer tokens=new StringTokenizer(names," ");
		while(tokens.hasMoreElements())
		{
			String element=(String)tokens.nextElement();
			System.out.println(element);
		}
		String [] newnames=names.split(" ");
		for(String c: newnames)
		{
			System.out.println(c);
		}
		
		
	}
	
	
}
