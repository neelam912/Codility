package com.PracticeLinkQuestions;

import java.util.*;

public class PrefixArray {
	static int solution(int[] A) {
		HashSet<Integer> list=new HashSet<>();
		int ret=0;
		for(int i=0;i<A.length;i++)
		{
			if(list.isEmpty()==true || list.contains(A[i])==false)
			{
				list.add(A[i]);
				ret=i;
			}	
		}
		return ret;
	}
	public static void main(String[] args) {
		int[] A= {2,2,1,0,1};
		System.out.println(solution(A));
		int[] A2= {2,2,1,0,1,3,2,1};
		System.out.println(solution(A2));
	}
}
