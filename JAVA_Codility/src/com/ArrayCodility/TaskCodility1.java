package com.ArrayCodility;

import java.util.Scanner;

public class TaskCodility1 {
	public static void rotate(int[] arr,int n,int r)
	{
	/*	if(r<n)
		{
			System.out.println("array length");
		}
		int[] temp=new int[r+1];
		int j=0,r1=r,i;
		for(i=0;i<arr.length;i++)
		{
			System.out.println("check "+i);
			temp[j]=arr[i];
			if(r1==0)
				break;
			arr[i] = arr[n-r1];
			r1--;
			j++;
		}
		
		for(j=0;i<n;i++)
		{
			if(j<=r-1)
			{
			arr[i]=temp[j];
			j++;
			}
				
		}*/
		int j;
		int[] newArr =new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			int pos=(i+r)%arr.length;
			newArr[pos]=arr[i];
		}
		
		for(j=0;j<n;j++)
		{
			System.out.print(newArr[j]+" ");
		}
	}
	public static void main(String[] args) {
		int n, r;
		Scanner sc=new 	Scanner(System.in);
		System.out.println("enter the num of elements in array");
		n=sc.nextInt();
		System.out.println("enter the num of rotations you want to perform");
		r=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		rotate(arr,n,r);
	}

}
