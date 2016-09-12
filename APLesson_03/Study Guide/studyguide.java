import java.util.Scanner; 

public class studyguide
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		//Question 1
		int num = 45;
		System.out.println("IronMan has " + num + " kinds of weapons in his suit.");
		
		//Question 2
		String pres = "Abraham Lincoln";
		String quote = "Whatever you are, be a good one.";
		System.out.println(pres + " once said, " + "\"" + quote + "\"");
		
		//Question 3
		int h = 45;
		int w = 64;
		System.out.println("The area of your rectangle is.... " + (h*w));
		
		//Question 4
		/* The code would cause an error because entering "seven" instead of 7
		   makes the input type a string automatically*/
		 
		//Question 5
		//C: Is there a Mr. or Mrs. Buster?
		
		//Question 6 
		//B
		
		//Questions 7
		/* The text that is trying to be displayed has a quotation mark inside it
		   and that is ending the string when the coder wants to continue it, in this
		   cause it would be best to remove the quotation or just use an escpae character */
		   
		//Question 8
		System.out.println("This one goes on top\nThis one goes on botton\n");
		
		//Question 9
		System.out.println("a   b   c\nd   e   f\ng   h   i\n");
		
		//Question 10
		/* The the program fails to make sure that the inputs are stored as doubles,
		   not integers. This is a problem when divides by an integer because it rounds
		   down and this leads to an answer of 0. */
		
	}
}