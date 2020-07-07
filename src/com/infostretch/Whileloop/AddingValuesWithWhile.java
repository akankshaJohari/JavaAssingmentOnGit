package com.infostretch.Whileloop;

import java.util.Scanner;

//Que - Write a program that gets an integer from the user. Add up all the numbers from 1 to that number, and display the total. Use a for loop to do it. 
public class AddingValuesWithWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int num =sc.nextInt();
		int sum=0;
		int i=1;
		while(i<=num) {
			System.out.print( i +" ");
			sum=sum+i;
			i++;
		}
		System.out.println("The sum is " + sum);
	}

}

