package NiketAssingment;

import java.util.Scanner;

public class TelephoneBill {
	
	static int Monthlycharge =0;
		public static void main(String[] args) {
			int calls;
			float price;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("For consumer number of calls made are:");
			calls = sc.nextInt();
			
			if(calls>100 && calls<=200) {
				price =((calls-100)*0.80f);
				System.out.println("Consumer is charged " + price );
			}
			else if(calls>200 && calls<=300) {
				price = ((calls-200)*1)+80;
				System.out.println("Consumer is charged" + price );
			}
			else if(calls>300) {
				price =((calls-300)*1.2f)+180;
				System.out.println("Consumer is charged" + price);
			}
			else if(calls==100) {
				System.out.println("Consumer is charged" + Monthlycharge );
			}
			
			
			


	}

}
