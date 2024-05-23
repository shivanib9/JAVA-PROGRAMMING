package primeNumber;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n =scan.nextInt();
		checkPrime(n);
	}
public static void checkPrime(int n)
{
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			System.out.println(n+" is not prime");
		return;
		}	
	}
	System.out.println("Is prime");
}
}
