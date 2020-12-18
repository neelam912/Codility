package com.StackNQueues;

import java.awt.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
import java.util.Stack;

public class Brackets {
	static void solution(char[] A)
	{
		Stack<Character> stack=new Stack<>();
		/*List<Character> open=Arrays.asList('(','{','[');
		List<Character> close=Arrays.asList(')','}',']');
		for(int i=0;i<A.length;i++)
		{
			if(open.contains(A[i]) == true)
			{
				stack.push(A[i]);
			}
			else if(close.contains(A[i]) && !stack.empty())
			{
				Character top=stack.peek();
				if(open.indexOf(top)==close.indexOf(A[i]))
				{
					stack.pop();
				}
				else
					 break;
			}
		}*/
		/*
		for(int i=0;i<A.length;i++)
		{
			if(A[i]=='(' || A[i]=='{' || A[i]=='[')
			{
				stack.push(A[i]);
			}
			if(A[i]==')')
			{
				if(stack.peek()=='(')
				stack.pop();
				else
					break;
			}
			else if(A[i]=='}')
			{
				if( stack.peek()=='{')
				stack.pop();
				else
					break;
			}
			else if(A[i]==']')
			{
				if(stack.peek()=='[')
		        stack.pop();
				else
					break;
			}
			
		}*/
		if(stack.size()==0)
		{
			System.out.println(1);
			//return 1;
		}
		else
		System.out.println(0);
			//return 0;
//		top=top+1;
		
		
	}
	public static void main(String[] args) {
		int N;
		System.out.println("enter the num of elements");
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		char[] A=new char[N];
		for(int i=0;i<N;i++)
		{
			A[i]=sc.next().charAt(0);
		}
		solution(A);
	}

}





/*
 * 
 *  Stack<Character> stack=new Stack<>();
        if(S.length()==0)
        {
            return 1;
        }
		for(int i=0;i<S.length();i++)
		{
			if(S.charAt(i)=='(' || S.charAt(i)=='{' || S.charAt(i)=='[')
			{
				stack.push(S.charAt(i));
			}
			if(S.charAt(i)==')' && !stack.empty())
			{
			    if(stack.peek()=='(')
				stack.pop();
				else
				return 0;
			}
			else if(S.charAt(i)=='}' && !stack.empty())
			{
			    if(stack.peek()=='{')
				stack.pop();
				else
				return 0;
			}
			else if(S.charAt(i)==']' && !stack.empty())
			{
			    if(stack.peek()=='[')
		        stack.pop();
		        else
		        return 0;
			}
			
		}
		if(stack.size()==0)
		{
			
			return 1;
		}
		else
		
			return 0;
    }
}
 */



/*
 * 
 *  Stack<Character> stack=new Stack<>();
		List<Character> open=Arrays.asList('(','{','[');
		List<Character> close=Arrays.asList(')','}',']');
		for(int i=0;i<S.length();i++)
		{
			if(open.contains(S.charAt(i)) == true)
			{
				stack.push(S.charAt(i));
			}
			else if(close.contains(S.charAt(i)) && !stack.empty())
			{
				Character top=stack.peek();
				if(open.indexOf(top)==close.indexOf(S.charAt(i)))
				{
					stack.pop();
				}
				else
					 return 0;
			}
		}
		return (stack.empty()==true)?1:0;
 * 
 * */
