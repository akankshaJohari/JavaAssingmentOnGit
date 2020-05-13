package NiketAssingment;

import java.util.Scanner;

public class ABCDE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int sum;
		System.out.println("Enter the number");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(i%5!=0)
			{ 
				if(i%5==1) {
					System.out.println(i+"." + "a");
				}
				if(i%5==2) {
					System.out.println(i+"." + "b");
				}
				if(i%5==3) {
					System.out.println(i+"." + "c");
				}
				if(i%5==4) {
					System.out.println(i+"." + "d");
				}
				else{
					System.out.print("");
					}
			}
			else{
				System.out.println(i +"."+"e");
				}	
		}
	}	
}

/*1.a -notdiv
2.b
3.c --notdiv
4.d
5.e -notdiv

6.a 
7.b -notdiv
8.c
9.d -notdiv
10.e 
*/
