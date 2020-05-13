package NiketAssingment;

public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1;int sum;
		for(int i=0;i<=10;i++) {
			sum=a+b;
			System.out.print(a + " ");
			a=b;
			b=sum;
		}
		
	}

}
