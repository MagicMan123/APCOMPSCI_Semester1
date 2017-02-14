public class ticketRunner 
{
	public static void main(String[]args)
	{
		Ticket person1 = new Walkup();
		Ticket person2 = new Advance(5);
		Ticket person3 = new StudentAdvance(13);
		
		System.out.print(person1);
		System.out.print(person2);
		System.out.print(person3);
	}
}