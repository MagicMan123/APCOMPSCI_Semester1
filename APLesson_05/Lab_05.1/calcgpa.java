import java.util.Scanner;

public class calcgpa
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your final grade in Math:");
		String math = kb.nextLine();
		
		System.out.println("Please enter your final grade in Biology:");
		String biology = kb.nextLine();
		
		System.out.println("Please enter your final grade in English:");
		String english = kb.nextLine();
		
		System.out.println("Please enter your final grade in Music:");
		String music = kb.nextLine();
		
		System.out.println("Please enter your final grade in History:");
		String history = kb.nextLine();
		
		System.out.println("Please enter your final grade in Spanish:");
		String spanish = kb.nextLine();
		
		System.out.println("Please enter your final grade in PE:");
		String pe = kb.nextLine();
		
		double gpa = (calcPoints(math)+calcPoints(biology)+calcPoints(english)+calcPoints(music)+calcPoints(history)+calcPoints(spanish)+calcPoints(pe))/7;
		
		System.out.println("\nYour total GPA is " + gpa + ".");
	}
	public static double calcPoints(String grade)
	{
		if(grade.equals("A"))
		{
			return 4.0;
		}
		if(grade.equals("B"))
		{
			return 3.0;
		}
		if(grade.equals("C"))
		{
			return 2.0;
		}
		if(grade.equals("D"))
		{
			return 1.0;
		}
		if(grade.equals("F"))
		{
			return 0.0;
		}
		return 0.0;
	}
}