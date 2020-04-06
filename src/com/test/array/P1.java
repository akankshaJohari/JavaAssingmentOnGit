package com.test.array;
// finding existing elements in an array 
import java.util.ArrayList;
import java.util.Scanner;

public class P1 {
	
	
	public static boolean findElement(int x, ArrayList l) {
		for(int i=0;i<l.size();i++) 
		{
			if(x==(Integer)l.get(i)) 
			{
				System.out.print("the no is found is l" +l.get(i) );
				return true;
			}
			
		}
		return false;
	}

	public static void main(String[] args)
	{
		ArrayList l1 = new ArrayList();
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the length of list l1");
		int len1= sc.nextInt();
		
		for(int i=0;i<len1;i++) {
				System.out.print("Enter the elements to be added in list l1");
				l1.add(sc.nextInt());
		}
		
		ArrayList l2 = new ArrayList();
		System.out.print("enter length of list l2");
		int len2= sc.nextInt();
		
		for(int i=0; i<len2; i++) {
			System.out.print("Enter the elements to be added in list l2");
			l2.add(sc.nextInt());
		}
		
		for(int i=0; i<len1;i++) {
			if(findElement((Integer)l1.get(i),l2)) 
			{
				System.out.println("no matched in list is" + l1.get(i));
				
			}

		}
		
	}
}
			
	
