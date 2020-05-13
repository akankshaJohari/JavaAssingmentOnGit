package com.infostretch.training.ForLoop;

import java.util.Scanner;

public class CountingMachineRevisited {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,num1,num2;
		Scanner sc = new Scanner(System.in);
	       
		System.out.print( "count from: " );
		num = sc.nextInt();
		
		System.out.print( "count to: " );
		num1 = sc.nextInt();
		
		System.out.print( "count by: " );
		num2 = sc.nextInt();
		
	
		
        for ( int i = num ; i <= num1 ; i = i+num2 )
        {
            System.out.print(" " + i);
        }
	
	}

}
