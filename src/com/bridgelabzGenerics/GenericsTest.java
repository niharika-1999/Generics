package com.bridgelabzGenerics;
import java.util.*;

public class GenericsTest {
	public static void main(String[] args)
	{
		System.out.println("Enter Parameters 3 or 4");
		Scanner sc=new Scanner(System.in);
		int par = sc.nextInt();
		if(par==3)
		{
			int aInt=30,bInt=10,cInt=50;
			new TestMaximum(aInt,bInt,cInt).max(aInt,bInt,cInt);
			
			float afloat=50.7f,bfloat=100.5f,cfloat=67.9f;
			new TestMaximum(afloat,bfloat,cfloat).max(afloat,bfloat,cfloat);
			
			String aStr="Apple",bStr="Peach",cStr="Banana";
			new TestMaximum(aStr,bStr,cStr).max(aStr,bStr,cStr);
		}
		else
		{
			int aInt=30,bInt=13,cInt=57,dInt=88;
			new TestMaximum(aInt,bInt,cInt,dInt).max(aInt,bInt,cInt,dInt);
			
			float afloat=56.3f,bfloat=100.5f,cfloat=69.9f,dfloat=450.3f;
			new TestMaximum(afloat,bfloat,cfloat,dfloat).max(afloat,bfloat,cfloat,dfloat);
			
			String aStr="Apple",bStr="Peach",cStr="Banana",dStr="Watermelon";
			new TestMaximum(aStr,bStr,cStr,dStr).max(aStr,bStr,cStr,dStr);
		
		}
		
	}

}
