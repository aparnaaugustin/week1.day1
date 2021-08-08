package week1.day1;

public class AddNumbers {

	public static void main(String[] args) {
		int temp=0;
		int num=345;
		while (num!=0) {
			temp=temp+ num%10;
			num=num/10;
		
		}
		System.out.println(temp);
	}

}
