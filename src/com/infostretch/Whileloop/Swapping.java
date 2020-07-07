package com.infostretch.Whileloop;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 1;
		while ( n<=1)
		{ 
			n++;
			int a=5;
			int b=6;
			
			/*int temp=a;
			a=b;
			b=temp;
			System.out.println("a is:" + a + "and" + "b is:" + b);
			*/
			
			//-----------------------without 3rd variable
		
		
			b=b+a; //6+5=11 ie b=11
			a=b-a;//11-5=6 ie a=6
			b=b-a;//11=6 ie b=5
			System.out.println("a is: " +  a  +"and" + "b is :" +b);
		
		}
	}

}
