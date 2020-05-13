package com.infostretch.training.ForLoop;

import java.util.Scanner;

public class CountingOddnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	       
		System.out.print( "count till: " );
		int num = sc.nextInt();
		
		for ( int i=1 ; i <=num  ; i++ )
        {
			if(i%2 != 0) {
				System.out.println("the odd numbers are : "  + i );
			}
		}
      }
	
	}


