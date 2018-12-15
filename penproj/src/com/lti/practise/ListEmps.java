package com.lti.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
@SuppressWarnings("deprecated")
public class ListEmps {
	public static void main(String[] args) {
		
	Emp e1=new Emp(23,"john",3343);
	Emp e2=new Emp(63,"Alex",3376);
	Emp e3=new Emp(43,"Steve",8763);
	Emp e4=new Emp(39,"Tanu",3893);
	Emp e5=new Emp(82,"Manu",98766);
	Emp e6=new Emp(15,"Kanu",8783);
	List<Emp> emplist =new ArrayList<>();
	emplist.add(e1);
	emplist.add(e2);
	emplist.add(e3);
	List<Emp> templist =new ArrayList<>();
	templist.add(e4);
	templist.add(e5);
	templist.add(e6);
	List<Emp> allemployees =new LinkedList<>();
	allemployees.addAll(emplist);
	allemployees.addAll(	templist);
	
	Iterator iterator=allemployees.iterator();
	while(iterator.hasNext())
	{
		Emp empp=(Emp)iterator.next();
		System.out.println(empp);
		
	}
	allemployees.remove(2);
	System.out.println("After removing an emp");
	for(Emp e:allemployees)
	{
		System.out.println(e);
		
	}
	System.out.println(emplist);
	System.out.println(templist);
	List<Integer> Lists =new LinkedList<>();
	Integer arr[]= {50,67,89,23,12,56,50,90,23,98,32,90};
	Lists=Arrays.asList(arr);
	for(int i:Lists)
	{
		System.out.println(i);
	}
	Set<Integer> set1=new HashSet<>();//removes duplicates
	set1.addAll(Lists);
	System.out.println(set1);
	
	TreeSet<Integer> set11=new TreeSet<>();//removes duplicate and sorts 
	set11.add(34);
	Integer arr1[]= {50,67,89,23,12,56,50,90,23,98,32,90};
	List<Integer> Lists1 =Arrays.asList(arr1);
	set11.addAll(Lists1);
	System.out.println(set11);
	
	System.out.println("after sorting on sal using comparable");
	Collections.sort(allemployees);
	for(Emp i:allemployees)
	{
		System.out.println(i);
	}
	System.out.println("after sorting on Name using comparator");
	Collections.sort(allemployees, new EmpNameComparator());
	for(Emp i:allemployees)
	{
		System.out.println(i);
	}
	System.out.println("after sorting on Id using comparator");
	Collections.sort(allemployees,new EmpIdComparator());
	for(Emp i:allemployees)
	{
		System.out.println(i);
	}
	
	Map<String,Emp> empMap=new HashMap<>();
	empMap.put("Admin", e1);
	empMap.put("IT", e2);
	empMap.put("Comp", e3);
	System.out.println("Complete set");
	System.out.println(empMap.entrySet());
	System.out.println("only the values");
	System.out.println(empMap.values());
	System.out.println("only the keys");
	System.out.println(empMap.keySet());
	}
}
