package com.PracticeLinkQuestions;
//given a number in binary.
//return the num of steps to reduce it  to 1:
//if current num is odd, add 1 to it
//if current num is even, divide it by 2
public class NumberOfStepsToReduceItToOne {
	static long binaryToDecimal(String s)
	{
		
		long decimal=0;
		int x=1;
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)=='1') {
				decimal=decimal+x;
			}
			x=x*2;
		}
		return decimal;
	}
	static int solution(String A) {
		int count=0;
		//int num=Integer.parseInt(A, 2);
		long num=binaryToDecimal(A);
		System.out.println(num);
		while(num!=1)
		{
			if(num%2!=0)
			{
				num=num+1;
			}
			else
				num=num/2;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		String bin= "1101";
		System.out.println(solution(bin));
	}

}
