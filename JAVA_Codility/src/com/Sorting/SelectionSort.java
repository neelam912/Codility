package com.Sorting;

import java.util.Scanner;

public class SelectionSort {
	static void solution(int[] A) {
		int small=0,j=0;
		for(int i=0;i<A.length-1;i++)
		{
			small=i;
			for(j=i+1;j<A.length;j++)
			{
				if(A[j]<A[small])
				{
					small=j;
				}
			}
			int t=A[i];
			A[i]=A[small];
			A[small]=t;
		}
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+" ");
		}
	}
	public static void main(String[] args) {
	int N;
	System.out.println("enter the num of elements");
	Scanner sc = new Scanner(System.in);
	N = sc.nextInt();
	int[] A = new int[N];
	for (int i = 0; i < N; i++) {
		A[i] = sc.nextInt();
	}
	solution(A);
	}

}
