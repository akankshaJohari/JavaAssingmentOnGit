package NiketAssingment;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		while(num!=0) {
			int num1=num%10;
			System.out.print(num1);
			num=num/10;
	
		}
	}
}



/*
123
321

123%10 =3 num1
123/10 =12 = num

12%10=2 num1
12/10 =1

1%10=1 num1
1/10 =0
*/