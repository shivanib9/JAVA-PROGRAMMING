package programsonarrays;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int arr[][][]=new int[3][2][4];
	
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			for(int k=0;k<=arr[i][j].length-1;k++)
{	
		System.out.println("enter the age of the school "+i+" of class "+j+" of student "+k);
		arr[i][j][k]=scan.nextInt();
		
		}
	}
	}
	System.out.println("array contents are....");
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			for(int k=0;k<=arr[i][j].length-1;k++)
			{
				
			System.out.print(arr[i][j][k]+" ");
		}
		System.out.println();
	}
		System.out.println();
	
	}

	}
	}
