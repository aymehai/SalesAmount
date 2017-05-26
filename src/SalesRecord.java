import java.util.Scanner;
import java.util.Random;

public class SalesRecord {

	public static void main(String[] args) {

		double taxCodePercent = 0;
		String enterAnotherCustomer = "y";
		double salesTax;
		double totalAmount;
		Scanner keyboard = new Scanner(System.in);
		Random number = new Random();

		do {

			System.out.println("what is your name?");
			String customerName = keyboard.next();

			System.out.println("What is the sales amount?");
			double salesAmount = keyboard.nextDouble();

			System.out.println("What is the tax code (NRM,NPF,BIZ)?");
			String taxCode = keyboard.next();

			if (taxCode.equalsIgnoreCase("NRM")) {
				taxCodePercent = .06;
			}

			if (taxCode.equalsIgnoreCase("NPF")) {
				taxCodePercent = 0;
			}

			if (taxCode.equalsIgnoreCase("BIZ")) {
				taxCodePercent = .45;
			}

			taxCode = taxCode.toUpperCase();
			int randomNumber = number.nextInt(1000);
			salesTax = (taxCodePercent*salesAmount);
			totalAmount = salesTax + salesAmount;
			
			System.out.println(" ");
			System.out.println("Customer ID: " + randomNumber);
			System.out.println("Customer Name: " + customerName);
			System.out.println("Sales Amount: " + salesAmount);
			System.out.println("Tax Code: " + taxCode);
			System.out.println("Total Amount Due: " + totalAmount);
			
			System.out.println(" ");
			System.out.println("Do you want to enter another record? y/n");
			enterAnotherCustomer = keyboard.next();

		} while (enterAnotherCustomer.equals("y"));
		
		System.out.println("GoodBye");

	}

}
