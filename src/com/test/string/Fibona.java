package com.test.string;

import java.util.Scanner;

public class Fibona {
   public static int fib(int n) {
	   int a = 0;
       int b = 0;
       int c= 1;
	   for(int i = 1; i <= n; i++)
       {
           a = b;
           b = c;
           c = a + b;
           System.out.print(a+" ");
		   
	   }
	return n;
		
   }	
	   
	
	   
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n;
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of n:");
        n = s.nextInt();
       
		System.out.println("Fibonacci Series:" + fib(n));
	}

}
