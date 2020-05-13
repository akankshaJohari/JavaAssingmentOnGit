package NiketAssingment;

import java.util.Scanner;

public class HelloHi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(i%2!=0) 
			{
				System.out.println(i+ "." +"Hello");
			}
			else {
				System.out.println(i + "." +"Hi");
			}
		}
	}

}

/*
1.hello

3.hello

5.hello*

7.hello

9.hello
*/