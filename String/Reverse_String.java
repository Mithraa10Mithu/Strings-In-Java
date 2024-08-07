package com.mec.practice1;

public class Reverse_String {

	public static void main(String[] args) {
		String s="meow meow";
		String s2="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s2=s2+s.charAt(i);
		}
     System.out.println(s2);
	}

}
