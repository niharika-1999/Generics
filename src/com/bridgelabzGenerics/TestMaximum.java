package com.bridgelabzGenerics;

//Given 3 Integers to find maximum
public class TestMaximum <T extends Comparable<T>>
   {
	
	T a,b,c;//class variables
	
	public TestMaximum(T a,T b,T c)//Constructors for 3 variables
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	
	// Use of compareTo function for 3 variable
	public static <T extends Comparable<T>> T max(T a,T b,T c)
	{
		T max=a;
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
	
	//Printing maximum value for 3 variable
	public static<T> void printMax(T a,T b,T c,T max)
	{
		System.out.printf("Maximum Number is:",max);
	}
	
   }

   