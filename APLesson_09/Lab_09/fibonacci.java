import java.util.Scanner;

public class fibonacci
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your starting number: ");
		int start = kb.nextInt();
		
		System.out.println("Enter your sequence size: ");
		int size = kb.nextInt();
		
		int[] nums = new int[size];
		for(int i=0;i<nums.length;i++)
		{
			if(i==0 || i==1)
			{
				nums[i]=start;
			}
			else
			{
				nums[i]=nums[i-2]+nums[i-1];
			}
		}
		System.out.println("\nIn order.... ");
		for(int num : nums)
		{
			System.out.print(num + " ");
		}
	}
}