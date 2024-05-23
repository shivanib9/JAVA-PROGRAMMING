package naturalnumbersum;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int sum=scan.nextInt();
		calculateSum(sum);
		
	}
public static void calculateSum(int n) 
{
	int sum=0;
	for(int i=1;i<=n;i++) 
	{
		sum=sum+i;
	}
	System.out.println(sum);
}
}
