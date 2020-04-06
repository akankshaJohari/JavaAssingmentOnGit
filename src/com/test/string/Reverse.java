package com.test.string;

import java.util.Scanner;

public class Reverse {

	public static String rev1(String s) {
		String rev ="";
		for(int i=s.length()-1; i>=0; i--) {
        	
        	rev =rev+ s.charAt(i);
        }
		return rev;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "Nike";
		//String rev="";
        
        
       /* for(int i=0; i< original.length(); i++) {
        	int a = original.length() - i-1;
        	System.out.print(original.charAt(a));
        }*/
        
		
			/* for(int i=original.length()-1; i>=0; i--) {
		        	
		        	rev =rev+ original.charAt(i);
		        }
		*/
       
        Scanner sc = new Scanner(System.in);
        original = sc.nextLine();
        
		System.out.println(rev1(original));

	}
}
