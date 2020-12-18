package com.CountingElements;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class MissingPositiveInteger {
	public static int solution(int[] A)
	{
		HashSet<Integer> set=new HashSet<>();
		for(int i:A)
		{
			set.add(i);
		}
	    int ret=1;
		for(int i=1;i<=A.length;i++)
		{
			if(set.contains(i)!=true)
			{
				return i;
			}
		}
		return A.length+1;
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
		System.out.println(solution(A));
	}

}
