package com.ArrayCodility;

import java.util.Scanner;

public class ReverseArray {
	public static void reverseArray(int[] arr){
		int i,j=arr.length-1;
		for(i=0;i<j;i++,j--)
		{
			int t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
		}
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}
	public static void main(String[] args) {
		int n;
		System.out.println("enter the number of elements in array");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		reverseArray(arr);
	}

}
