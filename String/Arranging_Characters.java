package com.mec.practice1;
public class Arranging_Characters {
    public static void main(String[] args) {
		String s="DGV2427ey@$^*lfjvnkfjMKHB";
		String upper="";
		String lower="";
		String digit="";
		String special="";
		for(int i=0;i<s.length()-1;i++) {
			char ch=s.charAt(i);
			if(ch>='A'&& ch<='Z') upper+=ch;
			else if(ch>='a'&& ch<='z') lower+=ch;
			else if(ch>='0'&& ch<='9') digit+=ch;
			else special+=ch;
		}
		System.out.println(s);
		System.out.println(upper+" "+lower+" "+digit+" "+special+" ");
		

	}

}
