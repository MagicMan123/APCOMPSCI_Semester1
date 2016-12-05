import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class xsos
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		String[][]xAndO = new String[4][4];
		for(int i=0; i<xAndO.length;i++)
		{
			for(int j=0; j<xAndO[i].length;j++)
			{
				int rand = (int)(Math.random()*10%2)+1;
				if(rand==1)
				{
					xAndO[i][j] = "X";
				}
				else
				{
					xAndO[i][j] = "O";
				}
			}
		}
		for(int i=0; i<xAndO.length;i++)
		{
			for(int j=0; j<xAndO[i].length;j++)
			{
				System.out.print(xAndO[i][j] + "\t");
			}
			System.out.println();
		}
	}
}