package com.TimeComplexity;

import java.util.Scanner;

public class FrogJump {
	public static void solution(int X,int Y,int D)
	{
		int i,sum=X;
		int count=0;
		while(sum<=Y)
		{
			sum=sum+D;
			count++;
			
		}
		System.out.println(count);
	}
	public static void solution2(int X,int Y,int D)
	{
		int diff=Y-X;
		double count=Math.ceil((double)diff/D);
		System.out.println((int)count);
	}
	public static void main(String[] args) {
		int X,Y,D;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter values for X,Y and D");
		X=sc.nextInt();
		Y=sc.nextInt();
		D=sc.nextInt();
		solution2(X,Y,D);
	}

}
