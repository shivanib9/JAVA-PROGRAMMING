package agecategorizer;

import java.util.Scanner;

public class Age {
public static void categorizeAge(int age) {
	if(age>0 && age<=12)
	{
		System.out.println("child");
	}
	else if(age>12 && age<=19)
	{
		System.out.println("teen");
	}
	else if(age>20 && age<=59)
	{
		System.out.println("adult");
	}
	else if(age>60)
	{
		System.out.println("senior");
	}
	
}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int age=scan.nextInt();
		categorizeAge(age);
		
	}

}
