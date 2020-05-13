package com.infostretch.training.ForLoop;

import java.util.Scanner;

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
