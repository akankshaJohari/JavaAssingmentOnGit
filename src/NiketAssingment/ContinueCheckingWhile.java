package NiketAssingment;

import java.util.Scanner;

public class ContinueCheckingWhile {

	public static void main(String[] args) {
	    int i=2;
	    Scanner sc= new Scanner(System.in);
	    System.out.println("First prime no is " +i );
	    System.out.println("Do you wish to continue" );
	    String s = sc.next();
	    boolean isprime=true;	
		
	    while("y".equalsIgnoreCase(s)) 
			{    
				 isprime=true;
				 i++;
				for(int j=2;j<i;j++) 
					
				{   
					if(i%j==0) 
					{
					
					isprime=false;
					
					break;
					}
					
				}
				
				if(isprime) 
				  	{ 
					  System.out.println( i + " ");
					  
					  System.out.println("Do you wish to continue" );
						s =sc.next();
				  	}
				
			 	
			}
			System.out.println("Thank you for opting out" );
			
	}
}	

/*

1. i=2 <100 T assumin isprime true
  j=2 i=2 2<2 F 
*/