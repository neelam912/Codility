package com.PracticeLinkQuestions;

public class LargestBiValuedSlice {
	static int solution(int[] A) {
	//	for(int i=0;i<)
		int count=2;
		int[] check=new int[2];
		int i=2;
		int a=A[0], b=A[1];
		int max=0;
		while(i<A.length-1)
		{
			if(A[i]==a || A[i]==b)
			{
				count++;
				if(count>max)
					max=count;
				i++;
			}
			else
			{
				a=A[i];
				b=A[i+1];
				i=i+2;
				count=2;
			}
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		int[] A= {5,4,4,5,0,12};
		System.out.println(solution(A));
		int[] A1= {5,4,4,1,0,12};
		System.out.println(solution(A1));
		int[] A2= {5,4,12,6,5,6,5,5};
		System.out.println(solution(A2));
	}

}
