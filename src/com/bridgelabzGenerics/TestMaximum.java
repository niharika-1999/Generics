package com.bridgelabzGenerics;

//Given 3 Integers to find maximum
public class TestMaximum <Integer extends Comparable<Integer>>
   {
	
	Integer a,b,c;//class variables
	
	public TestMaximum(Integer a,Integer b,Integer c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	//To obtain maximum value
	public Integer max()
	{
		return TestMaximum.max(a,b,c);
	}
	
	// Use of compareTo function
	public static <Integer extends Comparable<Integer>> Integer max(Integer a,Integer b,Integer c)
	{
		Integer max=a;
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
	public static <Integer> void printMax(Integer a,Integer b,Integer c,Integer max)
	{
		System.out.printf("Maximum Number is:",max);
	}
	
   }

   