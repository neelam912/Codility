package com.StackNQueues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PDF_queue_grocery {
	public static void solution(int[] A) {
		//Queue<Integer> queue=new LinkedList<Integer>();
		/*for(int i=0;i<A.length;i++)
		{
			queue.offer(A[i]);
		}*/
		int size=0,result=0;
		for(int i=0;i<A.length;i++)
		{
			if(A[i]==0)
			{
				size++;
			}
			if(A[i]==1)
			{
				size--;
			}
			result=Integer.max(result, size);
		}
		System.out.println(result);
		
	}
	public static void main(String[] args) {
		int N;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++)
		{
			A[i]=sc.nextInt();
		}
		solution(A);
	}

}
