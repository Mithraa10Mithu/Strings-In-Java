package com.mec.practice1;

public class Pallindrome_String {
	public static void main(String[] args) {
		String s="jegadeesh";
		String s2="";
		for(int i=s.length()-1;i>=0;i--) {
			s2=s2+s.charAt(i);
		}
		if(s.equals(s2)) {
			System.out.println("It is a pallindrome string");
		}
		else
			System.out.println("It is not a pallindrome string");
		}
	}


