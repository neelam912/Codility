package com.PracticeLinkQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class KthLargestElement {
	public static void solution(int[] A,int k)
	{
		ArrayList<Integer> list=new ArrayList<>();
		for(int i:A)
		{
			list.add(i);
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Iterator it=list.listIterator();
		int count=0;
		int element=0;
		while(it.hasNext())
		{
			A[count]=(int)it.next();
			count++;
		}
		element=A[A.length-k];
		System.out.println(element);
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
		System.out.println("value of k ");
		int k=sc.nextInt();
		solution(A,k);
	}

}
