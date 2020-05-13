package com.infostretch.training.ForLoop;

import java.util.Scanner;

public class Primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isprime=true;
	  Scanner sc= new Scanner(System.in);
	  System.out.println("count till the number");
	  int num = sc.nextInt();
	  
	  for(int i=2; i<=num;i++) 
	  {
		  isprime=true;
		  
		  for(int j=2; j<i; j++)
		  {
			  if(i%j==0) 
			  {
				  isprime=false;
				  break;
			  }
			  
		  }
		  
	  if(isprime) 
	  	{
		  System.out.println("the following numbers are prime : "  + i );
	  	}
 
	  else
	  {
		  System.out.println("the following numbers are not prime : "  + i);
	  	}
	}
  }
}
