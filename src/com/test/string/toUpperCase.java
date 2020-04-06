package com.test.string;

import java.util.Scanner;

public class toUpperCase {
	
	public static String upper(String s) {
		String s1 = "";
		for(int i =0; i<s.length(); i++) {
			if(s.charAt(i)>=97 && s.charAt(i)<=122) {
				char n = (char) (s.charAt(i)-32);
				s1 = s1+n;
			}
			else{
				s1 = s1+s.charAt(i);
				
			}
		}
		
		return s1;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String convert = sc.nextLine();
		System.out.println(upper(convert));
	}
}

