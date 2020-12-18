package com.TimeComplexity;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2MissingTerm {
	public static void solution(int[] A)
	{
		HashMap<Integer,Integer> map=new HashMap<>();
		int j=0;
		for(int i:A)
		{
			map.put(i, ++j);
		}
		int ret=0;
		for(Map.Entry<Integer,Integer> m: map.entrySet()) {
			if(m.getKey()!=m.getValue())
			{
				ret=m.getValue();
				break;
			}
		}
		System.out.println(ret);
	}
	public static void solution2(int[] A)
	{
		int size=A.length;
		long sum=((size+1)*(size+2))/2;
		long sum1=0;
		for(int i:A)
		{
			sum1=sum1+i;
		}
		long ret=sum-sum1;
		System.out.println((int)ret);
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
		solution2(A);
	}

}
