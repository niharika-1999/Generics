package com.bridgelabzGenerics;

//Given 3 Integers to find maximum
public class TestMaximum <Float extends Comparable<Float>>
   {
	
	Float a,b,c;//class variables
	
	public TestMaximum(Float a,Float b,Float c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	//To obtain maximum value
	public Float max()
	{
		return TestMaximum.max(a,b,c);
	}
	
	// Use of compareTo function
	public static <Float extends Comparable<Float>> Float max(Float a,Float b,Float c)
	{
		Float max=a;
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
	public static<Float> void printMax(Float a,Float b,Float c,Float max)
	{
		System.out.printf("Maximum Number is %s ",max);
	}
	
   }

   
