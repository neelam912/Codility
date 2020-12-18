package com.DebugCodility;

public class BugFixing3 {
	//check if the array contains every number from 1 to K atleast once
	public boolean solution(int[] A, int K) {
		int n = A.length;
		for (int i = 0; i < n - 1; i++) {
			if (A[i] + 1 < A[i + 1])
				return false;
		}
		if (A[0] != 1 && A[n - 1] != K)
			return false;
		else
			return true;
	}
	
	public static void main(String[] args) {
		int[] A = {1, 1, 2, 2, 3};
		int K = 3;
		System.out.println(new BugFixing3().solution(A, K));
		int[] A2 = {1, 2, 3};
		int K2 = 3;
		System.out.println(new BugFixing3().solution(A2, K2));
		int[] A3 = {1, 2, 3,3,5,6,6};
		int K3 = 5;
		System.out.println(new BugFixing3().solution(A3, K3));
		int[] A4 = {2, 2, 3,4};
		int K4 = 3;
		System.out.println(new BugFixing3().solution(A4, K4));
		int[] A5 = {1, 2, 3,4,4};
		int K5 = 4;
		System.out.println(new BugFixing3().solution(A5, K5));
		int[] A6 = {1, 2, 3};
		int K6 = 1;
		System.out.println(new BugFixing3().solution(A6, K6));
	}

}
