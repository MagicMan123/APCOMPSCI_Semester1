import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class expressionsolve
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter an expression to have solved: ");
		String expression = kb.nextLine();
		
		ArrayList<String> equation = new ArrayList<>(Arrays.asList(expression.split(" ")));
		
		doEquation(equation);
	}
	public static void doEquation(ArrayList<String> eq)
	{
		int i=0;
		while(i<eq.size())
		{
			if(eq.get(i).equals("*"))
			{
				eq.set(i,"" + (Integer.parseInt(eq.get(i-1)) * Integer.parseInt(eq.get(i+1))));
				eq.remove(i-1);
				eq.remove(i);
			}
			else if(eq.get(i).equals("/"))
			{
				eq.set(i,"" + (Integer.parseInt(eq.get(i-1)) / Integer.parseInt(eq.get(i+1))));
				eq.remove(i-1);
				eq.remove(i);
			}
			else if(eq.get(i).equals("+"))
			{
				eq.set(i,"" + (Integer.parseInt(eq.get(i-1)) + Integer.parseInt(eq.get(i+1))));
				eq.remove(i-1);
				eq.remove(i);
			}
			else if(eq.get(i).equals("-"))
			{
				eq.set(i,"" + (Integer.parseInt(eq.get(i-1)) - Integer.parseInt(eq.get(i+1))));
				eq.remove(i-1);
				eq.remove(i);
			}
			else if(eq.get(i).equals("*") || eq.get(i).equals("/") || eq.get(i).equals("+") || eq.get(i).equals("-"))
			{
				doEquation(eq);
			}
			i++;
		}
		System.out.println(eq.get(0));
	}
}