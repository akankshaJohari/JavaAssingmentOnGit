package NiketAssingment;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string :");
		String str =sc.nextLine();
		boolean isPalin=true;
//		String orig=str;
//		for(int i=(str.length()-1); i>=0; i--)
//				{
//		    rev=rev+str.charAt(i);
//		    
//		}
		
	/*	for(int i=0;i<str.length();i++) {
			rev=str.charAt(i)+rev;
		}
		System.out.println("Reverse Char is "  + rev );
		if(orig.equals(rev)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	
*/
		for(int i=0 ; i<str.length();i++) {
			
			if((str.charAt(i)!=str.charAt(str.length()-1-i)))
			{
				isPalin=false;
				
				break;
			
			}
		}
		if(isPalin) {
			System.out.println("The string is  palindrome");
		}
		else {
			System.out.println("The string is not palindrome");
		}
	}
}
	

