package com.infostretch.training.ForLoop;

import java.util.Scanner;
//Write a program that gets an integer from the user. Add up all the numbers from 1 to that number, and display the total. Use a for loop to do it.
public class AddingValuesWithForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			
			System.out.print( i +" ");
			sum=sum+i;
			
			
		}
		System.out.println("The sum is " + sum);
	}

}
