package com.infostretch.Whileloop;

import java.util.Scanner;

public class NumberguessingWithCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int guess=6;
		int count=0;
		System.out.println("I have chosen a number between 1 and 10 .Try to guess it");
		System.out.print("Your Guess : ");
		int num = sc.nextInt();
		count++;
		while(num!=guess) {
			count++;
			System.out.println("That is incorrect guess again");
			System.out.print("Your Guess : " );
			num=sc.nextInt();
		}
		System.out.print("That's right you're a good guesser" );
		System.out.println("It only took you " + count + " Tries to guess");
		
		
	}
	
	
	/*//1 guess =1
  inco
   gues 2
   incorrect
   guess 6
   
  */
	
	
	
}
