package com.PrefixSum;

import java.util.Scanner;

public class SumArray {
	public static void sumArr(int[] A){
		int n=A.length;
		int[] sum=new int[n];
		
		sum[0]=A[0];
		for(int i=1;i<n;i++)
		{
			sum[i]=sum[i-1]+A[i];
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(sum[i]+" ");
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
	 }

}
