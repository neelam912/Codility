package com.DebugCodility;

import java.util.Arrays;
//return the minimal value that occurs in both the arrays
//if no match found return -1

public class BugFixing2 {
	int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n && i<m;) {
            if (A[k] == B[i])
                return A[k];
            if (B[i] < A[k])
             i += 1;
          else
          	k+=1;

        }
        return -1;
    }
	public static void main(String[] args) {
		int[] A = {2, 4, 6, 7};
		int[] B = {2, 1, 1, 8};
		System.out.println(new BugFixing2().solution(A, B));
		int[] A2 = {0, 1, 2, 3};
		int[] B2 = {2, 1, 3, 4,5};
		System.out.println(new BugFixing2().solution(A2, B2));
		int[] A3 = {10, 6, 7, 8};
		int[] B3 = {2, 1, 3};
		System.out.println(new BugFixing2().solution(A3, B3));
		int[] A4 = {10, 3, 7, 8};
		int[] B4 = {2, 1, 3};
		System.out.println(new BugFixing2().solution(A4, B4));
	}
	

}
