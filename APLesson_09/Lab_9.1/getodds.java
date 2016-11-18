import java.util.Scanner;

public class getodds
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		int[] nums = new int[10];
		
		fillArray(nums);
		printArray(nums);
		System.out.println("\nThe odds are " + getOdds(nums));
	}
	public static int[] fillArray(int[] nums)
	{
		
		
		for(int i=0; i<nums.length;i++)
		{
			nums[i]=(int)(Math.random()*100)+1;
		}
		return nums;
	}
	public static void printArray(int[] nums)
	{
		for(int num : nums)
		{
			System.out.print(num + " ");
		}
	}
	public static String getOdds(int[] nums)
	{
		String odds = "";
		for(int num : nums)
		{
			if(num%2==1)
			{
				odds += num + " ";
			}
		}
		return odds;
	}
}