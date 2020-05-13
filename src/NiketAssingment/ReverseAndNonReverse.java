package NiketAssingment;

import java.util.Scanner;

public class ReverseAndNonReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		for(int i=0 ; i<=num;i++) {
			
			System.out.println("The number is	" +  i	 +   "  	"        + (100-i));
		}
	}

}
