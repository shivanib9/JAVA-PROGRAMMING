package object;

public class Table {
	int SeatingCapacity;
	int cost;
	String brand;
	String color;
	
	void allowToSit()
	{
		System.out.println("user can sit on the table which is "+color+"in  color");
	}
	void allowToWrite()
	{ 
	System.out.println("User can write in book by placing book on table which is"+cost+"in cost");
	}
	
	
	}
