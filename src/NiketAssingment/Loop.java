package NiketAssingment;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int max=0;
		int min=0;
		
		for(int i=0;i<=10;i++) {
			System.out.println("Enter the numbers");
			int num=sc.nextInt();
			if(max<num) {
				max=num;
			}
			
		}
		System.out.println("the maximum number is " +max);
	}

}
