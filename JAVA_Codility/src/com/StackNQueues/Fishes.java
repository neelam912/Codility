package com.StackNQueues;

import java.util.Scanner;
import java.util.Stack;

public class Fishes {
	public static int solution(int[] A,int[] B) {
		Stack<Integer> stack=new Stack<>();
		int alive=A.length;
		for(int i=0;i<A.length;i++)
		{
			if(B[i]==1)
			{
				
				stack.push(A[i]);
				System.out.println("stack size is "+stack.size()+" when i = "+i);
			}
			if(B[i]==0)
			{
				while(!stack.isEmpty()) {
					if(stack.peek() >A[i])
					{
						System.out.println("fish "+A[i]+" is eaten by "+stack.peek());
						alive--;
						break;
					}
					else if(A[i]>stack.peek()) {
						System.out.println("fish "+stack.peek()+" is eaten by "+A[i]);
						alive--;
						stack.pop();
					}
				}
			}
		}
		return alive;
	}
	public static void main(String[] args) {
		int N;
		System.out.println("enter num of fish");
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		int[] A=new int[N];
		int[] B=new int[N];
		for(int i=0;i<N;i++)
		{
			A[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++)
		{
			B[i]=sc.nextInt();
		}
		System.out.println(solution(A,B));
	}
}
