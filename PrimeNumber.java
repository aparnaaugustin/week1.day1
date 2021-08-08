package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=13;
		boolean flag=false;
		int num2=num/2;
		for (int i = 2; i <=num2 ; i++) {
			if (num%i==0) {
				
				flag=true;
				break;
			} 
			
		}
		if(flag==false)
			System.out.println("Prime Number");
		else
			System.out.println("Not a prime Number");
	}

}
