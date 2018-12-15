package com.lti.practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		List<Double>/*generic*/ listofsals=new ArrayList<>();
		listofsals.add(3343.44);
		listofsals.add(3563.44);
	//	listofsals.add("a");
Iterator iterator=listofsals.iterator();
while(iterator.hasNext())
{
	Double sal=(Double)iterator.next();
	System.out.println(sal);
}	}

}
