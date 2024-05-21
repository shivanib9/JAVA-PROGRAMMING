package conditionalcontrolconstructs;

public class Calculator {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		sub(a,b);
		System.out.println("calculation completed");
	}
	public static void sub(int a,int b) {
		int c=a-b;
		System.out.println(c);
		
	}

}
