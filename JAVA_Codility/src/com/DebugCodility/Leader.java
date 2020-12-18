package com.DebugCodility;

import java.util.Scanner;

public class Leader {
	   static int solution(int[] A) {
	        int n = A.length;
	        int[] L = new int[n + 1];
	        L[0] = -1;
	        for (int i = 0; i < n; i++) {
	            L[i + 1] = A[i];
	        }
	        int count = 0;
	        //(1)  int pos = (n + 1) / 2;
	        int pos=(n/2)+1;
	        int candidate = L[pos];
	        for (int i = 1; i <= n; i++) {
	            if (L[i] == candidate)
	                count = count + 1;
	        }
	        //(2) if (count > pos)
	        if(count >= pos)
	            return candidate;
	        return (-1);
	    }
	
	public static void main(String[] args) {
		int N;
		System.out.println("enter the num of elements and array");
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		int[] A=new int[N];
		for(int i=0;i<N;i++)
		{
			A[i]=sc.nextInt();
		}
		System.out.println(solution(A));
	}


}
