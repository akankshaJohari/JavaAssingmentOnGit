package NiketAssingment;

import java.util.Scanner;

public class FindBiggestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=sc.nextInt();
		System.out.println("Enter second number");
		int num2=sc.nextInt();
		if(num1 > num2) {
			System.out.println("biggest number is:" + num1 );
		}
		else if(num1 < num2){
			System.out.println("biggest number is:" + num2 );
		}
		else {
			System.out.println("Both numbers are Equal");
		}
	}

}
