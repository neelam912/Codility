package com.ArrayCodility;

import java.util.Scanner;

public class demo1 {
	public static void main(String[] args) {
		int n=6;
		int days=0;
		Scanner sc= new Scanner(System.in);
		float[] temp=new float[6];
		System.out.println("enter temp for 6 days in week");
		for(int i=0;i<n;i++)
		{
			temp[i]=sc.nextFloat();
		}
		for(int i=0;i<n;i++)
		{
			if(temp[i] < 0.0)
			{
				days++;
			}
		}
		System.out.println("Temperature got negative for "+days+" days");
	}

}
