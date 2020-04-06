package com.test.string;

public class String1 {

	public static void main(String[] args) {
		String str = "abc";
		String str1 = "abc";
		
		System.out.println(str==str1);
		
		String s = str1+str;
		
		StringBuilder sb = new StringBuilder();
		
		char a = 'A';
		int i = a ;
		
		s= str1+i;
		
		System.out.println(s);
		
		System.out.println((int)a);
		
		
		
		
	}

}
