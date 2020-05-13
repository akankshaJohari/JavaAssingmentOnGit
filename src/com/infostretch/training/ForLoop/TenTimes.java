package com.infostretch.training.ForLoop;

import java.util.Scanner;

public class TenTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
       
		System.out.println( "Message: " );
        
		String message = sc.nextLine();

        for ( int n = 1 ; n <= 10 ; n = n+1 )
        {
            System.out.println( n + ". " + message + ". " );
        }
	
	}

}
