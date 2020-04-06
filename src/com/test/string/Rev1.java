package com.test.string;


public class Rev1 {
     
	public static void main(String[] args) {
		 String Orig ="How Are You";
	     String arr[] = Orig.split("");
	     String rev = "";
	     
	     
	     
		System.out.println("Reverse string is " + reverse(Orig) );

	}
	public static String reverse(String rev) {
		
		for(int i=0; i<rev.length();i++) {
			rev = rev.charAt(i)+rev;
		}
		
		return rev;
		
	}


}
