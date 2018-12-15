package com.lti.misc;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.lti.practise.Emp;

public class TesterAnn {

	public static void main(String[] args) {
	Class e=Emp.class;
	Annotation ann[]=e.getAnnotations();
	for (Annotation a:ann)
	{
		System.out.println(a.toString());
	}
Method methods[]=e.getMethods();
for (Method a:methods)
{Annotation mann[]=a.getAnnotations();
for (Annotation a1:mann)
{
	System.out.println(a1.toString());
}}
	}

}
