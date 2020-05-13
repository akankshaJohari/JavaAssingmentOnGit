package NiketAssingment;

import java.util.Scanner;

public class ReadOperatorAndNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,operator,result;
        Scanner sc= new Scanner(System.in);
		System.out.println("enter first number");
		x =sc.nextInt();
		System.out.println("enter second number");
		y =sc.nextInt();
		System.out.println("Choose from the below list of operator options");
		System.out.println("For Addition enter :       	    1"  );
		System.out.println("For Subtraction enter :     	2"  );
		System.out.println("For Multiplication enter :	    3"  );
		System.out.println("For division press :           	4"  );
		System.out.println("For Modulus as output press :   5"  );
		operator=sc.nextInt();
		
		switch (operator){
        case 1:
        	if(operator==1) {
        		result=x+y;
        		System.out.println("addition is : "   +result );
        	}
        	break;
        case 2:
        	if(operator==2) {
        		result=x-y;
        		System.out.println("subtraction is : "   +result );
        	}
        	break;
        case 3:
        	if(operator==3) {
        		result=x*y;
        		System.out.println("Multiplication is : "   +result );
        	}
        	break;
        case 4:
        	if(operator==4) {
        		result=x/y;
        		System.out.println("division is : "   +result );
        	}
        	break;
        case 5:
        	if(operator==5) {
        		result=x%y;
        		System.out.println("Modulus is : "   +result );
        	}
        	break;
        	
        default:
        	System.out.println("incorrect operator name");
        	break;
        
		}

	}
}	
