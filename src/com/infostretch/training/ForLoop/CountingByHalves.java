package com.infostretch.training.ForLoop;

import java.util.Scanner;

public class CountingByHalves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	       
		System.out.print( "count from: " );
		float num = sc.nextFloat();
		
		System.out.print( "count till: " );
		float num1 = sc.nextFloat();
		
		System.out.print( "count by: " );
		float num2 = sc.nextFloat();
		
		for ( float i=num ; i <=num1  ; i = i+num2 )
        {
            System.out.println(" " + -i);
        }
	
	}

}
