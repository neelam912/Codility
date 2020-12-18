package com.PracticeLinkQuestions;

public class SubArrayWithSumZero {
	//Given an array of positive and negative numbers, find if there is a subarray (of size at-least one) with 0 sum.
	static Boolean solution(int[] A) {
		int[] sum=new int[A.length];
		sum[0]=A[0];
		for(int i=1;i<A.length;i++)
		{
			int s=sum[i-1]+A[i];
			if(s==0)return true;
			if(s>=sum[i-1])
			{
				sum[i]=A[i];
			}
			else
				sum[i]=s;
			
		}
		for(int i =0;i<A.length;i++)
		{
			if(sum[i]==0)
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] A= {4, 2, -3, 1, 6};
		System.out.println(solution(A));
		int[] B= {4, 2, 0, 1, 6};
		System.out.println(solution(B));
		int[] C= {-3, 2, 3, 1, 6};
		System.out.println(solution(C));
		int[] D= {1, 2, 3, -9, 6};
		System.out.println(solution(D));
		}

}
