package com.mec.practice1;

public class Reverse_Number {

	public static void main(String[] args) {
	  int num=122;
	  int temp=num;
	  int rev=0;
	  int j=0;
	  while(num>0) {
	  j=num%10;
	  rev=rev*10+j;
	  System.out.println(rev);

	  j=num/10;
		  
	  }
	}

}
