package week1.day1;

public class FibonacciSeries  {

	public static void main(String[] args) {
		int range=6;
		int frstNum=0;
		int secNum=1;
		System.out.println(frstNum);
		System.out.println(secNum);
		
		for (int i = 1; i<=range; i++) {
			int sum=frstNum+secNum;
			frstNum=secNum;
			secNum=sum;
			System.out.println(sum);
		}

	}

}
