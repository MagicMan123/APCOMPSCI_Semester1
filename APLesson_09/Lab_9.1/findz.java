import java.util.Scanner;

public class findz
{
	public static void main(String[]args)
	{	
		String[] nums = new String[5];
		fillArray(nums);
		printArray(nums);
		System.out.println("\n\nThe words that have Z\'s are: " + findzs(nums));
	}
	public static void fillArray(String[] nums)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter " + nums.length +" words: ");
		for(int i=0; i<nums.length;i++)
		{
			nums[i]=kb.next();
		}
	}
	public static void printArray(String[] nums)
	{
		for(String num : nums)
		{
			System.out.print(num + " ");
		}
	}
	public static String findzs(String[] nums)
	{
		String zs = "";
		for(String num : nums)
		{
			if(num.indexOf('z')>=0 || num.indexOf('Z')>=0)
			{
				zs = zs + num + " ";
			}
		}
		return zs;
	}
}