package com.infostretch.training.ForLoop;

import java.util.Scanner;

public class NoticingEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=Sc.nextInt();
		
		for(int i=1;i<=num;i++) 
				//System.out.println((i%2==0)?i+"<":i);
			if(i%2==0) {
				System.out.println(i+"<");
			}
			else {
				System.out.println(i);
			}
			
		}

	}


