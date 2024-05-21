package programsonarrays;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[3];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter an elements");
			arr[i]=scan.nextInt();
		}
		System.out.println("array elements are......");
		for(int i=0;i<=arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
	}

}
