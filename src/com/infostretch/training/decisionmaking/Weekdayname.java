package com.infostretch.training.decisionmaking;

import java.util.Scanner;

public class Weekdayname {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num =sc.nextInt();
	
		if(num==0 || num==7) {
			System.out.println("Weekday " + num + " : is saturday");
			
		}
		else if(num==6) {
			System.out.println("Weekday " + num + " : is friday");
		}
		else if(num==5){
			System.out.println("Weekday " + num + " : is Thursday");
		}
		else if(num==4) {
			System.out.println("Weekday " + num + " : is Wednesday");
		}
		else if(num==3) {
			System.out.println("Weekday " + num + " : is Tuesday");
		}
		else if(num==2) {
			System.out.println("Weekday " + num + " : is Monday");
		}
		else if(num==1) {
			System.out.println("Weekday " + num + " : is Sunday");
		}
		else {
			System.out.println("Weekday " + num + " : Error");
		}

	}

}


/*Use if and else to complete it according to the following table:

Number	Day of week
1	Sunday
2	Monday
3	Tuesday
4	Wednesday
5	Thursday
6	Friday
7	Saturday
0	Saturday
anything else	"error"

What You Should See
Weekday 1: Sunday
Weekday 2: Monday
Weekday 3: Tuesday
Weekday 4: Wednesday
Weekday 5: Thursday
Weekday 6: Friday
Weekday 7: Saturday
Weekday 0: Saturday

Weekday 43: error
Weekday 17: error
Weekday -1: error

Today is a Wednesday!*/