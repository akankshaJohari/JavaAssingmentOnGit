package NiketAssingment;

import java.util.Scanner;

public class CalculateGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name;
		int marks1,marks2,marks3,marks4,percentage,avg;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter your name");
		Name =sc.nextLine();
		
		System.out.println("enter your marks for first subject");
		marks1=sc.nextInt();
		
		System.out.println("enter your marks for second subject");
		marks2=sc.nextInt();
		
		System.out.println("enter your marks for third subject");
		marks3=sc.nextInt();
		
		System.out.println("enter your marks for fourth subject");
		marks4=sc.nextInt();
		avg =((marks1+marks2+marks3+marks4)/4);
		percentage =avg;
		
		 if(percentage>90) {
			 System.out.println("Grade A for " + Name );
		 }
		 else if(percentage>70 && percentage<90) {
			 System.out.println("Grade B for " +Name);
		 }
		 else if(percentage>50 && percentage<70) {
			 System.out.println("Grade C for " +Name);
		 }
		 else if(percentage<50 ) {
			 System.out.println("Grade D for " +Name);
		 }

	}

}


/*Percentage> 90 , Grade A.
Percentage> 70 and < 90 , Grade B.
Percentage> 50 and < 70 , Grade C.
Percentage< 50 , Grade D.*/
