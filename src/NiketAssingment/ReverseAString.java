package NiketAssingment;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string :");
		String str =sc.nextLine();
		 
		for(int i=0; i<str.length(); i++)
		{
			rev=str.charAt(i)+rev;
    
		}
		System.out.print("Reverse Char is "  + rev );
	}

		//-------------OR----------------
		/*for(int i=(str.length()-1); i>=0; i--)
		{
			rev=rev+str.charAt(i);
    
		}
		System.out.print("Reverse Char is "  + rev );
	}
*/

	}


