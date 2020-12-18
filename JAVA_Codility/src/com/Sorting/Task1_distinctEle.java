package com.Sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Task1_distinctEle {
	public static void solution(int[] A) {
	    Arrays.sort(A);
	    int distinct=1;
	    for(int i=1;i<A.length;i++)
	    {
	    	if(A[i]!=A[i-1])
	    	{
	    		distinct++;
	    	}
	    }
	    System.out.println(distinct);
	/*	HashSet<Integer> set=new HashSet<>();
		for(int i:A)
		{
			set.add(i);
		}
		System.out.println(set.size());*/
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
