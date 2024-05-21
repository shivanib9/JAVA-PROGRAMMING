package programsonarrays;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner scan=new  Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter marks of students"+i);
			arr[i]=scan.nextInt();
		}
		System.out.println("markse of the students are....");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+"|");
		}
	}

}
