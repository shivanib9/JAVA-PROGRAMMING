package vendingmachinesimulator;

import java.util.Scanner;

public class Coffee {
	public static void getProduct(String productCode) {
	switch(productCode)
	{
	case "P01":System.out.println("COCA COLA");
	break;
	case "P02":System.out.println("pepsi");
	break;
	case "P03":System.out.println("Fanta");
	break;
	case "P04":System.out.println("Jaljeera");
	break;
	case "P05":System.out.println("Mountain dew");
	break;
	case "P06":System.out.println("boatguava");
	break;
	default:System.out.println("let the drink be panaka");
	}
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String pcode=scan.next();
		getProduct(pcode);
		
	}

}
