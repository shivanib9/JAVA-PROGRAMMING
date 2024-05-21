package shivaniprograms;

public class Method1 {

	public static void main(String[] args) {
 greet();
 add();
 sub();

	}
	public static void greet()
	{
		System.out.println("hello world");
	}
public static void add()
{
	int a=10;
	int b=10;
	int c=(a+b);
	System.out.println("sum of two numbers are "+c);
}
public static void sub() 
{
int a=20;
int b=10;
int c=(a-b);
System.out.println("substraction of two numbers are"+c);
}
}
