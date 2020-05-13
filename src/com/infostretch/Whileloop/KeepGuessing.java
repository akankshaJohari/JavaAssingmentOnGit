package com.infostretch.Whileloop;

import java.util.Scanner;

public class KeepGuessing {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int secretno =6;
     System.out.println("I Have chosen a number between 1-10 try guessing it!");
     System.out.print("Your guess: ");
     int num=sc.nextInt();
    
     
     while(num!=secretno) {
    	 System.out.println("\nThat's incorrect guess again. !");
    	 System.out.print("Your guess : ");
    	 num =sc.nextInt();
     }
     System.out.println("\nCongrats! Right  guess");
	}

}
