package com.test.string;

import java.util.Scanner;

public class Practice {
	
	public static String rev(String s) {
		String rev="";
		for(int i = s.length()-1; i>=0 ;i--) {
			rev =rev+s.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		String orig= sc.nextLine();
		
		System.out.println(rev(orig));

	}

}
