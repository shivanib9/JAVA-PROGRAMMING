package sumofdigits;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		calculateSumDigits(n);
	}
	public static void calculateSumDigits(int n) {
		int sum=0;
		while(n>0)
		{
			int ld=n%10;
			sum=sum+ld;
			n=n/10;
		}
		System.out.println("sum of digits is "+sum);
	}

}
