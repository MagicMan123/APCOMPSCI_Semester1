import java.util.Scanner;

public class reverseorder
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		//Take inputs
		System.out.println("Enter 5 names please: ");
		String[] names = new String[5];
		for(int i=0; i < names.length;i++)
		{
			names[i] = kb.next();
		}
		
		//Print in order
		System.out.println("\nIn order.... ");
		for(String name : names)
		{
			System.out.print(name + " \n");
		}
		
		//Run the method to print in reverse
		System.out.println("\nIn reverse order.... ");
		reverse(names);
	}
	//Method to print in reverse
	public static void reverse(String[] array)
	{
		for(int i=array.length-1;i >= 0;i--)
		{
			System.out.print(array[i] + "\n");
		}	
	}
}