package com.infostretch.Whileloop;

import java.util.Scanner;

public class CountingWithWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it five times." );
		System.out.print( "Message: " );
		String message = sc.nextLine();

		int n = 0;
		while ( n < 5 )
		{
			System.out.println( (n+1) + ". " + message );
			n++;
		}
	}

}
