package com.mec.practice1;
import java.util.Scanner;
public class Prime_Or_Not {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	if(num%2==0) {
		System.out.println("not prime");
	}
	else {
		System.out.println("prime");
	}
	}

}
