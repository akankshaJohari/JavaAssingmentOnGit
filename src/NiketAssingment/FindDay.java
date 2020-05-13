package NiketAssingment;

import java.util.Scanner;

public class FindDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dayno;
		String dayname;
        Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the day");
		dayno =sc.nextInt();
        switch (dayno){
        case 1:
        	dayname="Monday";
        	break;
        case 2:
        	dayname="Tuesday";
        	break;
        case 3:
        	dayname="Wednesday";
        	break;	
        case 4:
        	dayname="Thursday";
        	break;	
        case 5:
        	dayname="Friday";
        	break;
        case 6:
        	dayname="Saturday";
        	break;
        case 7:
        	dayname="Sunday";
        	break;	
        default:
        	dayname="incorrect day name";
        	break;
        }
        System.out.println("Day is " + dayname);

	}

}
