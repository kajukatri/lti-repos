package com.lti.misc;
import java.util.Arrays;
public class ArrayTest {
public static void main(String[] args)
{
	char var1='a';
	char vararr[]= new char[10];
	int numss[]=new int[10];
	for(int i=0;i<10;i++)
	{
		vararr[i]='a';
		numss[i]=(int) vararr[i];
		i++;
		
	}
	System.out.println(Arrays.toString(vararr));
	System.out.println(Arrays.toString(numss));
	double[] nums= {23.45,87.56,98.45,34.25,78.8,23.7};
	Arrays.sort(nums);
	System.out.println(Arrays.toString(nums));
	
}
}
