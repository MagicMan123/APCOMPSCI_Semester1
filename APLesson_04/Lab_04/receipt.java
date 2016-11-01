import java.util.Scanner;

public class receipt
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		receipt form = new receipt();
		
		System.out.println("Please enter item 1:");
		String item1 = kb.nextLine();
		
		
		System.out.println("Please enter the price:");
		double price1 = kb.nextDouble();
		
		kb.nextLine();
		
		System.out.println("\nPlease enter item 2:");
		String item2 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		double price2 = kb.nextDouble();
		
		kb.nextLine();
		
		System.out.println("\nPlease enter item 3:");
		String item3 = kb.nextLine();
		
		System.out.println("Please enter the price:");
		double price3 = kb.nextDouble();
		
		double subtotal = price1+price2+price3;
		double tax = .08*subtotal;
		double total = subtotal+tax;
		
		System.out.printf("<<<<<<<<<<<<<<<<<<<<<_Receipt_>>>>>>>>>>>>>>>>>>>>>\n\n");
		form.format(item1,price1);
		form.format(item2,price2);
		form.format(item3,price3);
		System.out.println("");
		form.format("Subtotal",subtotal);
		form.format("Tax",tax);
		form.format("Total",total);
		System.out.println("_____________________________________\n* Thank you for your support *");
	}
	
	public void format(String name, double value) 
	{
		
		System.out.printf("*%18s ........   %5.2f\n",name, value);
		
	}
}