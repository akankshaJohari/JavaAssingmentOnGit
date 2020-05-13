package com.infostretch.training.ForLoop;

import java.util.Scanner;

public class LetterAtATime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your message ? :");
		String Message =sc.nextLine();
		int count=0;
		String lowercase = Message.toLowerCase();
		
		
		System.out.println("Length of the message entered is : "  + Message.length());
		System.out.println("Char at position 0 is : "  + Message.charAt(0));
		System.out.println("Char at last position is : " + Message.charAt(Message.length()-1));
		
		
		for(int i=0; i<lowercase.length(); i++) {
			char ch = lowercase.charAt(i);
				System.out.println("Char at " + i + "is : "  + ((ch==' ')?("Blank Space"): 
				((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?( ch+ " is wowel" ):ch)));
				
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') 
			{
					count++;
					
					
			}
			
		}
		System.out.println("The number of vowels in the string are : " +count);
			
			
		}
		
		
	}

