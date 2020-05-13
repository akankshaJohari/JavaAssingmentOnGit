package NiketAssingment;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		int result;
		for(int i=1; i<=num;i++) {
		
			System.out.print("Table of " + i + "is :");
			
			for(int j=1; j<=10;j++) {
				result =i*j;
				System.out.print( result +" " );
			}
			System.out.println("");
		}
	}

}
