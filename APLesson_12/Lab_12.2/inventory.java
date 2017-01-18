import java.util.Scanner;

public class inventory
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Who is the manufacturer? ");
		String manu = kb.next();
		
		System.out.println("What is the name of the product? ");
		String  name = kb.next();
		
		System.out.println("Are you entering the category and price information?(y or n)");
		String avatar = kb.next();
		
		if(avatar.equals("n"))
		{
			inventory_class object1 = new inventory_class(manu, name);
			System.out.println(object1 + "\n");
		}
		else
		{
			System.out.println("What category is the product from? ");
			String type = kb.next();
		
			System.out.println("What is the price of your item? ");
			double  price = kb.nextDouble();
			
			inventory_class object1 = new inventory_class(manu, name, type, price);
			System.out.println(object1 + "\n");
		}
	}
}