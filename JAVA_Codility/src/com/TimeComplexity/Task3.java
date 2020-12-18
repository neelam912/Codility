package com.TimeComplexity;

import java.util.Scanner;

public class Task3 {
	public static void solution(int[] A)
	{
		long sum=0;
		for(int i:A)
		{
			sum=sum+i;
		}
		long tempsum=0;
		int diff=Integer.MAX_VALUE;
		int diff1=Integer.MAX_VALUE;
		for(int i=0;i<A.length-1;i++)
		{
			tempsum=tempsum+A[i];
			int diff2=(int)(sum-tempsum);
			diff1=(int)Math.abs(diff2-tempsum);
			if(diff1<diff)
			{
				diff=diff1;
			}
		}
		System.out.println(diff);
	}
	public static void main(String[] args) {
		int N;
		System.out.println("enter the num of elements");
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++)
		{
			A[i]=sc.nextInt();
		}
		solution(A);
	}

}
