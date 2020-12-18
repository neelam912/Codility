package com.PrefixSum;

import java.util.Scanner;

public class Task4_PassingCars {
	public static void solution(int[] A) {
		int n = A.length;
		int east = 0, west = 0;
		int pair = 0, incre = 1;
		for (int i = 0; i < n; i++) {
			if (A[i] == 0) {
				east++;
			}
			
				if (A[i] == 1) {
					// west=1;
					pair = pair + east;
					// west=0;
			}
		}
		if(pair>1_000_000_000)
		{
			
			pair=-1;
		}
		System.out.println(pair);

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
