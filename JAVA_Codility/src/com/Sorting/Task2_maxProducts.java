package com.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Task2_maxProducts {
	public static void solution(int[] A) {
	    Arrays.sort(A);
	    int n=A.length;
	    long max_product=A[n-1]*A[n-2]*A[n-3];
	    long ma_pro=A[0]*A[1]*A[n-1];
	    long max=Math.max(max_product, ma_pro);
	    System.out.println(max_product);
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
