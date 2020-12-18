package com.CountingElements;

import java.util.Scanner;

public class CountingElements {
	static int largest(int A[])
	{
		int large=0;
		for(int i=0;i<A.length;i++)
		{
			if(large < A[i])
			{
				large =A[i];
			}
		}
		return large;
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
		
		int[] count=new int[largest(A)+1];
		for(int i=0;i<A.length;i++)
		{
			count[A[i]]++;
		}
		
		for(int i=1;i<count.length;i++)
		{
			System.out.print(count[i]+" ");
		}
	}

}
