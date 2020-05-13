package com.infostretch.training.ForLoop;

import java.util.Scanner;

public class CountingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	       
		System.out.println( "count till the given number: " );
        
		int num = sc.nextInt();

        for ( int i = 0 ; i <= num ; i = i+1 )
        {
            System.out.print( " " + i );
        }
	
	 }

 }


