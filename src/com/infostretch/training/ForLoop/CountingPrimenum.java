package com.infostretch.training.ForLoop;

import java.util.Scanner;

public class CountingPrimenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isprime=true;   
		Scanner sc = new Scanner(System.in);
	       
		System.out.print( "the number is: ");
		int num = sc.nextInt();
		
		for ( int i = 2 ; i <num ; i++)
        {
			
			if(num%i==0) {
				isprime=false;
				break;	
			}
			
		}
		
		if(isprime) 
		{
			System.out.println("the given number is prime " + num );
		}
		else
		{
			System.out.println("the given number is not prime " + num );
		}
 
	}
	
}
	