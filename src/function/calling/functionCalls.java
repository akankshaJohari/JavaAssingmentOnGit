package function.calling;
//learning functions
public class functionCalls {
	
	public static void main(String args[]) {
	
		int x=10,y=20;
		System.out.println("1 . initial values : x =" +x +" y = "+y);
		callByValue(x, y);
		System.out.println("4 . values after call by values : x =" +x +" y = "+y);
		System.out.println("=========================================");
		System.out.println("values are not changes after call by value ");
		System.out.println("=========================================");
		
		Person p= new Person();
		
		
		
		
		
		
	}
	
	public static void callByValue( int a , int b) {
		System.out.println("2 . initial values : a =" +a +" b = "+b);
		int temp;
		temp =a ;
		a=b;
		b=temp;
		System.out.println("3 . final values : a =" +a +" b = "+b);
		
	}
	
	

}

class Person{
	int id ;
	String s;
	
}