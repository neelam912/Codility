package com.PrefixSum;

import java.util.Scanner;

public class Task2_GenomeIntQuery {
	static void solution(int[] P,int[] Q,String S) {
		int n=P.length;
		String substr="";
		int[] result=new int[n];
		int[][] arr=new int[n][4];
		
		for(int i=0;i<n;i++)
		{
			char c=S.charAt(i);
			if(c=='A') arr[i][0]=1;
			if(c=='C') arr[i][1]=1;
			if(c=='G') arr[i][2]=1;
			if(c=='T') arr[i][3]=1;
		}
		for(int i=1;i<n;i++) {
			for(int j=0;j<4;j++)
			{
				arr[i][j]=arr[i][j]+arr[i-1][j];
			}
		}
		int j=0;
		for(int i=0;i<P.length;i++)
		{
			int x=P[i];
			int y=Q[i];
			for(int a=0;a<4;a++)
			{
				int sub=0;
				if(x-1>=0) sub=arr[x-1][a];
				if(arr[y][a]-sub>0)
				{
					result[j]=a+1;
					j++;
					break;
				}
			}
		}
		/*for(int i=0;i<n;i++)
		{
			substr=S.substring(P[i], Q[i]+1);
			if(substr.contains("A")) {
				result[i]=1;
			}
			else if(substr.contains("C")) {
				result[i]=2;
			}
			else if(substr.contains("G")) {
				result[i]=3;
			}
			else if(substr.contains("T")) {
				result[i]=4;
			}
		}*/
		for(int i:result)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		int N;
		//System.out.println("enter the num of elements");
		Scanner sc=new Scanner(System.in);
		//N=sc.nextInt();
		int[] A= {2,5,0};
		int[] B= {4,5,6};
		/*for(int i=0;i<N;i++)
		{
			A[i]=sc.nextInt();
		}
		for(int i=0;i<N;i++)
		{
			B[i]=sc.nextInt();
		}*/
		/*System.out.println("enter the num of char i  string");
		int M=sc.nextInt();
		char[] str=new char[M];
		for(int i=0;i<M;i++)
		{
			str[i]=sc.next().charAt(0);
		}*/
	//	System.out.println(str);
		String str2="CAGCCTA";
		solution(A,B,str2);
	}

}
