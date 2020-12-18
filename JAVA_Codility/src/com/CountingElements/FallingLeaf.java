package com.CountingElements;

import java.util.HashSet;
import java.util.Scanner;

public class FallingLeaf {
	public static void solution(int[] A,int X)
	{
		int[] count=new int[X];
		int f=0;
		for(int i=0;i<A.length;i++)
		{
			f=0;
			count[A[i]-1]++;
			for(int j=0;j<X;j++)
			{
				if(count[j]==0)
				{
					f=1;
					break;
				}
			}
			if(f==0)
			{
				System.out.println(i);
				break;
			}
		}
		
	}
	
	
	static int solution2(int[] A,int X)
	{
		HashSet<Integer> set=new HashSet<>();
		for(int i=1;i<=X;i++)
		{
			set.add(i);
		}
		for(int i=0;i<A.length;i++)
		{
			if(set.contains(A[i]))
			{
				set.remove(A[i]);
			}
			if(set.isEmpty())
			{
				return i;
			}
		}
		return -1;
		
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
		System.out.println(solution2(A,5));
	}

}
