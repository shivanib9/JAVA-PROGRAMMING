package object;

public class TableApp {

	public static void main(String[] args) {
		Table t1=new Table();
		t1.SeatingCapacity=6;
		t1.cost=4500;
		t1.color="brown";
		t1.brand="greenplay";
		t1.allowToSit();
		t1.allowToWrite();
		System.out.println(t1.SeatingCapacity+" "+t1.cost+" "+t1.color+" "+t1.brand);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	
		Table t2=new Table();
		t2.SeatingCapacity=5;
		t2.cost=2000;
		t2.color="red";
		t2.brand="green";
		t2.allowToSit();
		t2.allowToWrite();
		System.out.println(t2.SeatingCapacity+" "+t2.cost+" "+t2.color+" "+t2.brand);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
}

}
