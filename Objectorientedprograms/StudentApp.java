package object;

public class StudentApp {

	public static void main(String[] args) {
		 Student s1=new Student();
		 Student s2=new Student();
		 s1.eat();
		 s2.study();
		 s1.sleep();
		 s2.study();
		 
		 s1.id=1;
		 s1.name="shivani";
		 s1.age=22;
		 s1.branch="ece";
		 
		 s2.id=2;
		 s2.name="vani";
		 s2.age=22;
		 s2.branch="eee";
		 
		 System.out.println(s1.id);
		 System.out.println(s1.name);
		 System.out.println(s1.age);
		 System.out.println(s1.branch);
		 
		 System.out.println(s2.id);
		 System.out.println(s2.name);
		 System.out.println(s2.age);
		 System.out.println(s2.branch);
		 
	}

}
