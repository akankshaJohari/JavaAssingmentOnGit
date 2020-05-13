package NiketAssingment;

import java.util.Scanner;

public class ElectricityBill {
 
 static int Monthlycharge =200;
	public static void main(String[] args) {
		int unit;
		int price;
		Scanner sc = new Scanner(System.in);
		System.out.println("For consumer no of units consumed are:");
		unit = sc.nextInt();
		if(unit>100 && unit<=200) {
			price =((unit-100)*3)+Monthlycharge;
			System.out.println("Consumer is charged " + price );
		}
		else if(unit>200 && unit<=300) {
			price = ((unit-200)*4)+Monthlycharge+300;
			System.out.println("Consumer is charged" + price );
		}
		else if(unit>300) {
			price =((unit-300)*5)+Monthlycharge+700;
			System.out.println("Consumer is charged" + price);
		}
		else if(unit==100) {
			System.out.println("Consumer is charged" +Monthlycharge );
		}
		
		
		

	}

}
