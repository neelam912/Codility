package com.CountingElements;

import java.util.HashMap;
import java.util.Scanner;

public class MaxCounters { 
	static void solution(int N, int[] A) {
		int[] count=new int[N];
		int lar=0,i=0;
		for(i=0;i<A.length;i++)
		{
			if(A[i]<=N)
			{
				++count[A[i]-1];
				if(count[A[i]-1]>lar)
				{
				lar=count[A[i]-1];
				}
			}
			else if(A[i]>N)
			{
				break;
			}
		}
		for(int j=0;j<N;j++)
		{
			count[j]=lar;
		}
		for(;i<A.length;i++)
		{
			if(A[i]<=N)
			{
				++count[A[i]-1];
				if(count[A[i]-1]>lar)
				{
				lar=count[A[i]-1];
				}
			}
		}System.out.println("edited with branch fixbug,output being printed below down");

		for(i=0;i<N;i++)
		{
			System.out.println(count[i]);
		}
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
		solution(5,A);
	}

}
