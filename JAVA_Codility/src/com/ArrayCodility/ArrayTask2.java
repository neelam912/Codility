package com.ArrayCodility;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ArrayTask2 {
	
	public static int returnSingle(int[] A,int N) {
		int unique=0;
		for(int i=0;i<N;i++)
		{
			for(int j=i+1;j<N;j++)
			{
				if(A[i]==A[j])
				{
					A[i]=-1;
					A[j]=-1;
					break;
				}
			}
		}
		for(int i=0;i<N;i++)
		{
			if(A[i] != -1)
			{
				unique=A[i];
			}
		}
		return unique;
	}
	
	public static int solution(int[] A)
	{
		int unique=0;
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i:A)
		{
			if(map.containsKey(i))
			{
				unique=map.get(i);
				unique++;
				map.put(i, unique);
			}
			else
				map.put(i, 1);
		}
		int oddnum=0;
		for(int i:map.keySet())
		{
			unique=map.get(i);
			if(unique%2!=0)
			{
				oddnum=i;
			}
		}
		
		return oddnum;
	}
	static int solution3(int[] A) {
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<A.length;i++)
		{
			if(set.isEmpty()==true || set.contains(A[i])==false)
			{
				set.add(A[i]);
			}
			else
				set.remove(A[i]);
			
		}
		for(int j:set)
		{
			return j;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println("enter the num of ele");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++)
		{
			A[i]=sc.nextInt();
		}
		//System.out.println(returnSingle(A,N));
		System.out.println(solution(A));
		System.out.println(solution3(A));
		
	}

}
