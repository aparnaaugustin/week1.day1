package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num=153;
		int num2=num;
		int total=0;
		int temp=0;

		while (num!=0) {
			temp=num%10;
			total=total+temp*temp*temp;
			num=num/10;
		}
		System.out.println(total);
		if (total==num2) {
			System.out.println("Armstrong Number");

		} else {
			System.out.println("Not an Armstrong Number");
		}

	}

}
