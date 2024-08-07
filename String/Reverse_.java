package com.mec.practice1;
import java.util.Scanner;
public class Reverse_{
	public static void main(String[]args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=scn.nextInt();
	    int rev=0;
		int r=0;
		while(num>0) {
			r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		System.out.println(rev);
	}

}
