package com.infostretch.Whileloop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DiceDoubles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Here comes the dice!");
		int i=1;
		//int num1,num2;
		int num1 = 6; 
        int num2 = 1; 
        int range = num1 - num2 + 1; 
        
        // generate random numbers within 1 to 10 
       
		while(i<=6) {
			for (int j= 0; j<= 6; j++) { 
				int rand = (int)(Math.random() * range) + num2;
				System.out.print("Roll #1 :"  );
				 System.out.println(rand);
				 num1=rand;
				 System.out.print("Roll #2 : " );
		    	 System.out.println(rand);
		    	 num2 =rand;
		    	 int sum=num1+num2;
		    	 System.out.println("Total is " +sum +"!");
		    	 
			 }
	    	 if(num1==num2) {
	    		 
	    		break;
	    	 }

		}
		
	}

}
