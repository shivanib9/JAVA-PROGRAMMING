package programsonarrays;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[][]=new int[3][4];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;j++) {
				
			System.out.println("enter the age of the class"+i+" of student"+j);
			arr[i][j]=scan.nextInt();
			
			}
		}
		System.out.println("array contents are....");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
