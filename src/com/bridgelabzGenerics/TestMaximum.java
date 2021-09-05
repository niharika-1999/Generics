package com.bridgelabzGenerics;

//Given 3 Integers to find maximum
public class TestMaximum <String extends Comparable<String>>
 {
	
	String a,b,c;//class variables
	
	public TestMaximum(String a,String b,String c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	//To obtain maximum value
	public String max()
	{
		return TestMaximum.max(a,b,c);
	}
	
	// Use of compareTo function
	public static <String extends Comparable<String>> String max(String a,String b,String c)
	{
		String max=a;
		if(b.compareTo(max)>0)
		{
			max=b;
		}
		if(c.compareTo(max)>0)
		{
			max=c;
		}
		printMax(a,b,c,max);
		return max;
	}
	
	//Printing maximum value
	public static<String> void printMax(String a,String b,String c,String max)
	{
		System.out.printf("Maximum Number is %s",max);
	}
	
 }

 

   
