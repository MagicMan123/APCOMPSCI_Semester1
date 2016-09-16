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
		
		form.format(item1, price1, item2, price2, item3, price3);
	}
	
	public void format(String item1, double price1, String item2, double price2, String item3, double price3) 
	{
		System.out.printf("<<<<<<<<<<<<<<<<<<<<<<<<_Receipt_>>>>>>>>>>>>>>>>>>>>>>>>\n\n*%15s ........   %5.2f\n*%15s ........   %5.2f\n*%15s ........   %5.2f\n\n*Subtotal ........   %5.2f\n*Tax ........   %5.2f\n*Total ........   %5.2f",item1,price1,item2,price2,item3,price3,(price1+price2+price3),0.08*(price1+price2+price3),1.08*(price1+price2+price3));
	}
}