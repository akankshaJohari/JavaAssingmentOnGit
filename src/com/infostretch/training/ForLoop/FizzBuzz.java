package com.infostretch.training.ForLoop;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) 
		{ 
				if(i%3==0) 
				{
						System.out.print("Fizz");
				}
				
				if(i%5==0) {
					System.out.print("Buzz");
				}
				if(i%3!=0 && i%5!=0) 
				{ 
					System.out.print(i);
				}
				System.out.println();
		}
				
	}	
}	

