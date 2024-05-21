package shivaniprograms;

public class Mehod6 {

	public static void main(String[] args) {
	greet();
	int x=20;
	int y=10;
	int res=multi(x,y);
	System.out.println("Multiplication result "+res);
	int res1=add(x,y);
	System.out.println("Addition result "+res1);
	boolean res2=checkgreater(x,y);
	System.out.println(res2);
int res3=add(x,y)/2;
System.out.println("average is "+res3);
sub();
int res4=div(x,y);
System.out.println(res4);
int res5=mod(x,y);
System.out.println(res5);
	}
	public static void greet() {
		
		System.out.println("hello world");
	}
	public static int add(int x,int y) {
		return x+y;
	}
public static void sub() {
	int a=20;
	int b=10;
	System.out.println(a-b);
}
public static int multi(int x,int y) {
	return x*y;
}
public static int div(int x,int y) {
	return x/y;
}
public static int mod(int x,int y) {
	return x%y;
}
public static boolean checkgreater(int x,int y) {
	return x>y;
}
}