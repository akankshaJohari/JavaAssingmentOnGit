package com.infostretch.Whileloop;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int sum=1;
		for(int i=1;i<=5;i++) {
			sum =i*sum;
			for(int j=1;j<=i;j++) {
				System.out.print(j+((i==j)?"":"*"));
				//System.out.print("");
			}
			System.out.println ("=" +sum);
		}
	}

}

/*1*2*3*4*5;
1
1*2

1st i=1; sum=1*1 =1
2nd i=2 sum=2*1=2
3rd i=3 sum=3*2=6
4th i=4 sum=4*6=24
5th i=5 sum=5*24=120


*/