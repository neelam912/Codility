package com.ArrayCodility;

import java.util.Scanner;

public class Task1Try {
	
	public static int[] rotate(int[] A,int K)
	{
		if(A.length==0)return A;
		if(A.length==1 || K==A.length) return A;
		if(K>A.length)
		{
			K=K-A.length;
		}
		while(K!=0)
		{
			int temp=A[A.length-1];
			for(int i=A.length-1;i>0;i--)
			{
				A[i]=A[i-1];	
			}
			A[0]=temp;
			K--;
		}
		
		return A; 
	}
	public static void main(String[] args) {
		int n, r;
		int arr1[]= {3,8,9,7,6};
		arr1=rotate(arr1,1);
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		int arr2[]= {3,8,9,7,6};
		arr1=rotate(arr2,2);
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		int arr3[]= {3,8,9,7,6};
		arr1=rotate(arr3,3);
		for(int i=0;i<arr3.length;i++)
		{
			System.out.print(arr3[i]+" ");
		}
	}

}
