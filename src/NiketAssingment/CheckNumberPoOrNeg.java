package NiketAssingment;

import java.util.Scanner;

public class CheckNumberPoOrNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			int num=sc.nextInt();
			if(num>0) {
				System.out.println("number is positive");
			}
			else if(num == 0) {
				System.out.println("number is zero");
			}
			else {
				System.out.println("number is negative");
			}

	}

}
