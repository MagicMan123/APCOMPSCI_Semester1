public class toystorerunner
{
	public static void main(String[]args)
	{
		toystore store = new toystore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		
		System.out.println("List of toys: " + store);
		
		System.out.println("\n");
		System.out.println("Most Frequent Toy: " + store.getMostFrequentToy());
		System.out.println("Most Frequent Type: " + store.getMostFrequentType());
	}
}