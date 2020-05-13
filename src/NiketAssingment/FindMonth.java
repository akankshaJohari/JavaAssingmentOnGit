package NiketAssingment;

import java.util.Scanner;

public class FindMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int monthno;
		String monthname;
        Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the Month number");
		monthno =sc.nextInt();
        switch (monthno){
        case 1:
        	monthname="Jan";
        	break;
        case 2:
        	monthname="Feb";
        	break;
        case 3:
        	monthname="march";
        	break;	
        case 4:
        	monthname="April";
        	break;	
        case 5:
        	monthname="May";
        	break;
        case 6:
        	monthname="June";
        	break;
        case 7:
        	monthname="July";
        	break;	
        case 8:
        	monthname="Aug";
        	break;	
        case 9:
        	monthname="Sept";
        	break;	
        case 10:
        	monthname="Oct";
        case 11:
        	monthname="Nov";
        	break;		
        case 12:
        	monthname="Dec";
        	break;	
        default:
        	monthname="incorrect Month name";
        	break;
        }
        System.out.println("Month is " + monthname);

	}


	}


