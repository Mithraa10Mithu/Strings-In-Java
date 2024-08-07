package com.mec.practice1;

public class Vowel_Contains {

	public static void main(String[] args) {
		String s="laddu";
		for(int i=0;i<s.length()-1;i++) {
			char ch=s.charAt(i);

		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println("It contains vowel");
		}
		else
			System.out.println("No vowel is present");
		}
	}

}
