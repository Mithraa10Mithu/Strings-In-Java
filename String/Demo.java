package com.mec.practice1;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int n=new Scanner(System.in).nextInt();
		
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		System.out.println(count);
	}

}
