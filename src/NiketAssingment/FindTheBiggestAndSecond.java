package NiketAssingment;

import java.util.Scanner;

public class FindTheBiggestAndSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		System.out.println("Enter third number");
		int num3 =sc.nextInt();
		System.out.println("biggest number is:" + ((num1 > num2 ? num1:num2)>num3?(num1 > num2 ? num1:num2):num3) );
		
		
	}

}
