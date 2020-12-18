package com.PracticeLinkQuestions;

public class LongestHappyString {
	public static void longestDiverseString(int a, int b, int c) {
		StringBuilder str = new StringBuilder();
		int i = 0;
		int n=a+b+c;
		//////
		int A=0,B=0,C=0;
		for(i=0;i<n;i++)
		{
			if((a>=b && a>=c && A<2)||(B==2 && a>0) ||(C==2 && a>0))
			{
				str.append("a");
				a--;
				A++;
				B=0;
				C=0;
			}
			else if((b>=a && b>=c && B<2)||(A==2 && b>0) ||(C==2 && b>0))
			{
				str.append("b");
				b--;
				B++;
				A=0;
				C=0;
			}
			
			else if((c>=b && c>=a && C<2)||(A==2 && c>0) ||(B==2 && c>0))
			{
				str.append("c");
				c--;
				C++;
				A=0;
				B=0;
			}
			//System.out.println(i+" this = "+str);
		}
		System.out.println("string "+str);
	}

	public static void main(String[] args) {
		System.out.println("running for 1 2 3");
		longestDiverseString(1, 2, 3);
		System.out.println("running for 1 2 7");
		longestDiverseString(1, 2, 7);
		System.out.println("running for 4 2 3");
		longestDiverseString(4, 2, 3);
	}

}
