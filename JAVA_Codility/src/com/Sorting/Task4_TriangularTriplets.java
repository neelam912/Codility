package com.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Task4_TriangularTriplets {
	 static int solution(int[] A) {
		Arrays.sort(A);
		
		for(int i=0;i<A.length-2;i++)
		{
			 if((long)A[i+1]>((long)A[i+2]-(long)A[i]))
			 {
				 System.out.println(A[i]+"  "+A[i-1]+" "+A[i-2]+" "+1);
				 return 1;
			 }
		}
		return 0;

		//System.out.println();
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
		System.out.println(solution(A));
	}
}
