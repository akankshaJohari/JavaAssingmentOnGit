package NiketAssingment;

import java.util.Scanner;

public class CalculateAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		char Gender,M,F;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Gender");
		Gender =sc.next().charAt(0);
		System.out.println("Enter your age");
		age =sc.nextInt();
		
		if(Gender=='M' && age >=21){
			System.out.println("The person with Gender " + Gender + " and age " + age + " is eligible for marriage " );
			}
		else if(Gender=='F' && age >=18){
			System.out.println("The person with Gender " + Gender + " and age " + age + " is eligible for marriage " );
			}
		else {
			System.out.println("Not eligible for marriage");
		}
	}

}
