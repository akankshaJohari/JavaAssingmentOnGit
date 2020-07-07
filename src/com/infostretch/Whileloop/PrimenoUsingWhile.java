package com.infostretch.Whileloop;

import java.util.Scanner;

public class PrimenoUsingWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isprime = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int i = 2;
		int j = 2;
	
		while (i < num) {
			//isprime=true;

			while (j < i)
			{
				if (i % j == 0) 
				{
					isprime = false;
					break;
				}
				 j++;
			}
			j=2;
			if (isprime) 
			{
				System.out.println(i);
			} else {
				System.out.println("not prime" + i);
			}
				i++;
		}

	}
}
