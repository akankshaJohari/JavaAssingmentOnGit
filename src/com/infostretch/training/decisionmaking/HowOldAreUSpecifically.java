package com.infostretch.training.decisionmaking;

import java.util.Scanner;

public class HowOldAreUSpecifically {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		String name = "Dev";

		
		  /*if(num<16){ 
			  System.out.println("Ok," + name + " you can't drive ");
		  } else if(num<18) { 
			  System.out.println("Ok," + name +" you can drive but not vote ");
		  } else if(num<=24) {
			  System.out.println("Ok," + name + " you can vote but not rent a car ");
		  }
		  else if(num>=25) {
			  System.out.println("Ok," + name +" you can do pretty much anything "); 
		  }*/
		  
		  if(num<16){ 
			  System.out.println("Ok," + name + " you can't drive ");
		  } 
		  if(num<18) { 
			  System.out.println("Ok," + name +" you can't vote ");
		  } 
		  if(num<=24) {
			  System.out.println("Ok," + name + " you can't rent a car ");
		  }
		  else if(num>=25) {
			  System.out.println("Ok," + name +" you can do pretty much anything "); 
		  }
		  
		 /* 1-16 cant drive 1-18 cant vote 1-24
		  cant rent car*/
		  
		  
		  
		 
		if (num < 24) {
			if (num < 18) {
				if(num<16) {
					System.out.println("Ok," + name + " you can't drive ");
				}
				System.out.println("Ok," + name + " you can't vote ");
			}
			System.out.println("Ok," + name + " you can't rent a car ");
		}
		else {
			System.out.println("Ok," + name + " you can do pretty much anything ");
		}

	}

}
