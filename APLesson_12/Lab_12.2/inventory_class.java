public class inventory_class
{
	private String manu, name, type;
	private int upc;
	private double price;
	
	public inventory_class(String man, String nam)
	{
		manu = man;
		name = nam;
		type = "NA";
		price = 0.00;
		upc = (int)(Math.random() * 1000000 * 10000);
	}
	
	public inventory_class(String man, String nam, String typ, double cost)
	{
		manu = man;
		name = nam;
		type = typ;
		upc = (int)(Math.random() * 1000000 * 10000);
		price = cost;
	}
	
	public String toString()
	{
	   return "Item Info...\nManufacturer: " + manu +"\nItem name: " + name +"\nCategory: " + type + "\nPrice: " + price + "\nUPC: " + upc;
	}
}