import java.util.Scanner;

public class biggestnumber
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		int[] nums = new int[10];
		fillArray(nums);
		printArray(nums);
		System.out.println("\nThe highest number in your array is " + getMax(nums));
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
	public static int getMax(int[] nums)
	{
		int max = 0;
		for(int num : nums)
		{
			if(num>max)
			{
				max = num;
			}
		}
		return max;
	}
}