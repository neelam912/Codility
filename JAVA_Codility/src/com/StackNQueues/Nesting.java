package com.StackNQueues;

import java.util.Scanner;
import java.util.Stack;

public class Nesting {
	public static int solution(String S) {
		Stack<Character> stack=new Stack<>();
        if(S.length()==0)
        {
            return 1;
        }
		for(int i=0;i<S.length();i++)
		{
			if(S.charAt(i)=='(')
			{
				stack.push(S.charAt(i));
			}
			if(S.charAt(i)==')' && !stack.isEmpty())
			{
			    if(stack.peek()=='(')
				stack.pop();
				else
				return 0;
			}
			else if(S.charAt(i)==')' && stack.isEmpty()==true)
			{
				return 0;
			}
				
		}
		if(stack.isEmpty()==true)
		{
			
			return 1;
		}
		else
		
			return 0;
	}
	
	public static void main(String[] args) {
		System.out.println("enter String");
		Scanner sc=new Scanner(System.in);
		String S=sc.next();
		System.out.println(solution(S));
	}

}
