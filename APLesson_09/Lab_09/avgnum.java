import java.util.Scanner;

public class avgnum
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		int[] nums = new int[10];
		for(int i=0; i<nums.length;i++)
		{
			nums[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("Numbers... ");
		for(int num : nums)
		{
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("The average of the numbers above is... " + average(nums));
		
	}
	public static int average(int[] nums)
	{
		int average = 0;
		for(int num : nums)
		{
			average += num;
		}
		average = average/nums.length;
		return average;
	}
}