package com.PrefixSum;

import java.util.Scanner;

public class Task3_MinimalAver {
	public static void solution(int[] A) {
		int n=A.length;
	    float averagelow=Float.MAX_VALUE;//Integer.MAX_VALUE;
		//int[] average=new int[n];
	    int lowaverPos=0;
		for(int i=0;i<n-2;i++)
		{
			float av1=(float)(A[i]+A[i+1]+A[i+2])/3;
			float av2=(float)(A[i]+A[i+1])/2;
			float averagelow1=Math.min(av1, av2);
			if(averagelow1<averagelow)
			{
				averagelow=averagelow1;
				lowaverPos=i;
			}
		}
		int av2=(A[A.length-2]+A[A.length-1])/2;
		if(av2 < averagelow)
		{
			averagelow=av2;
			lowaverPos=A.length-2;
		}
		
		
		System.out.println(lowaverPos);
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
