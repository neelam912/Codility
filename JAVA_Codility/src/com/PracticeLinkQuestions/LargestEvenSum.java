package com.PracticeLinkQuestions;

public class LargestEvenSum {
	public static int solution(int[] A) {
		int sum=0;
		for(int i=0;i<A.length;i++)
		{
			if(A[i]>0) {
				sum=sum+A[i];
			}
		}
		System.out.println("max possible sum is "+sum);
		int modify=Integer.MAX_VALUE;
		int add=0;
		if(sum%2==0)return sum;
		else {
			for(int i=0;i<A.length;i++)
			{
				int x=Math.abs(A[i]);
				if(x<modify && x%2!=0)
				{
					modify=x;
					add=A[i];
				}
			}
		}
		if(add<0)
		{
			return sum+add;
		}
		else
			return sum-add;
	}
	public static void main(String[] args) {
		int[] A= {-2,2,4,-3,5};
		System.out.println(solution(A));
		int[] A2= {-2,2,3,-3,1};
		System.out.println(solution(A2));
		int[] A3= {-2,-3,4,2,6,1};
		System.out.println(solution(A3));
	}

}
