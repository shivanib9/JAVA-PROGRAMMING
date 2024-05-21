package conditionalcontrolconstructs;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number between 1-7");
		int num=scan.nextInt();
				switch(num)
				{
				case 1:
					System.out.println("sunday");
					break;
				case 2:
					System.out.println("monday");
					break;
				case 3:
					System.out.println("tuesday");
					break;
				case 4:
					System.out.println("wednesday");
					break;
				case 5:
					System.out.println("thurday");
					break;
				case 6:
					System.out.println("friday");
					break;
				case 7:
					System.out.println("saturday");
					break;
					default:
						System.out.println("enter number between 1-7");
					
				}

	}

}
