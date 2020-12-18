package com.CountingElements;

import java.util.Scanner;

public class SwapSum {
	static Boolean solution(int[] A,int[] B,int m)
	{
		int sumA=0,sumB=0;
		for(int i=0;i<m;i++)
		{
			sumA=sumA+A[i];
			sumB=sumB+B[i];
		}
		int i,j;
		int diff=0;
		for(i=0;i<m;i++)
		{
			for(j=0;j<m;j++)
			{
				diff=B[j]-A[i];
				sumA=sumA+diff;
				sumB=sumB-diff;
				if(sumA==sumB)
				{
					return true;
				}
				sumA=sumA-diff;
				sumB=sumB+diff;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int N;
		System.out.println("enter the num of elements");
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		int[] A=new int[N];
		int[] B=new int[N];
		for(int i=0;i<N;i++)
		{
			A[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++)
		{
			B[i]=sc.nextInt();
		}
		
		System.out.println(solution(A,B,N));
	}

}
