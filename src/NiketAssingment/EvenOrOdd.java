package NiketAssingment;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Enter the number");
		if(num%2==0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("no is odd");
		}
	}

}
