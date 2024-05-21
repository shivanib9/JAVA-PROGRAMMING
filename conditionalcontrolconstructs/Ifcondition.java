package conditionalcontrolconstructs;
import java.util.Scanner;
public class Ifcondition {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int marks=scan.nextInt();
		System.out.println("welcome");
		if(marks>=80)
		{
			System.out.println("welcome to tech club");
		}
	}

}
