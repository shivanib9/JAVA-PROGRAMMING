package conditionalcontrolconstructs;

import java.util.Scanner;

public class Elseif {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your score");
		int score=scan.nextInt();
		Grade grade=new Grade();
		grade.giveGrade(score);
		
		
}
}
