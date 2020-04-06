package com.test.string;

import java.util.Scanner;

public class ElementFinder {

	public static boolean findElement(int x, int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x) {
				//System.out.println("Number matched is arr" +arr[i]);
				return true;
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner Sc = new Scanner(System.in);
		System.out.print("enter the length of first array");
		int l1= Sc.nextInt();
		System.out.print("enter the length of second array");
		int l2= Sc.nextInt();
		
		int arr1[] = new int[l1];
		for(int i=0 ; i<arr1.length;i++)
		{
			System.out.print("enter value at "+i+" :");
			arr1[i] =Sc.nextInt();
		}
		
		int arr2[] = new int[l2];
		for(int i =0;i<arr2.length;i++) {
			System.out.print("enter value at "+i+" :");
			arr2[i] = Sc.nextInt();
		}
		
		for(int i=0;i<arr1.length;i++) {
			if(findElement(arr1[i],arr2)) {
				System.out.println("no matched is arr" + arr1[i]);
				
			}
				
		}
	}

}
