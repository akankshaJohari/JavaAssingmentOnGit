package com.infostretch.training.ForLoop;

import java.util.Scanner;

public class XsAndYs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      
      System.out.print("start from " );
      float num = sc.nextFloat();
      
      System.out.print("count till " );
      float num1= sc.nextFloat();
      
      System.out.print( "count by: " );
	  float num2 = sc.nextFloat();
		
		for ( float x=num ; x <=num1  ; x = x+num2 )
			
      {
			float y = x*x;
			
			System.out.println("	" + -x	 +   "  	"        + y);
		
				
			}
          
      }
	
	}


