package shivaniprograms;

import java.util.Scanner;

public class Input2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter student first name");
		String a=scan.next();
		System.out.println("student first name ="+a);
		System.out.println("enter student last name =");
		String b=scan.next();
		System.out.println("student last name is"+b);
		System.out.println("enter student age");
		int c=scan.nextInt();
		System.out.println("student age  is"+c);
		System.out.println("enter student gender");
		String d=scan.next();
		System.out.println("student gender is"+d);
		System.out.println("Is student married ? say true or false");
		boolean e=scan.nextBoolean();
		System.out.println("student married ?"+e);
		System.out.println("enter student branch");
		scan.nextLine();
		String f=scan.nextLine();
		System.out.println("branch is"+f);
		System.out.println("enter student height");
		float g=scan.nextFloat();
		System.out.println("student height is"+g);
		System.out.println("enter student weight");
		double h=scan.nextDouble();
		System.out.println("weight ="+h);
		
	}

}
