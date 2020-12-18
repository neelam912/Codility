package com.PrefixSum;

import java.util.Scanner;

public class Task1_CountDiv {
	static void findDiv(int A,int B,int K)
	{
		int i=A,count=0;
		/*while(i<=B)
		{
			if(i%K==0)
			{
				count++;
				i=i+K;
			}
			else
				i++;
		}*/
		int add=0;
		int d1=(int)Math.floor(A/K);
		int d2=(int)Math.floor(B/K);
		if(A%K==0)
		{
			add=1;
		}
		int num_div=d2-d1;
		count=num_div+add;
		System.out.println(count);
	}
	public static void main(String[] args) {
		int A,B,K;
		Scanner sc=new Scanner(System.in);
		A=sc.nextInt();
		B=sc.nextInt();
		K=sc.nextInt();
		findDiv(A,B,K);
	}
}
