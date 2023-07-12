package in.ineuron.com;

import java.util.Arrays;

public class Q8_DuplicateAndMissingNumbers
{
	public static int[] findErrorNums(int[] nums)
	{
		int[] result = new int[2];
		int n = nums.length;
		
		//sort the array to identify the duplicate and missing numbers
		Arrays.sort(nums);
		
		int duplicate = -1;
		int missing = 1;
		
		//Traverse the sorted array to find the duplicate and missing numbers
		for(int i=1 ; i<n ;i++)
		{
			if(nums[i] == nums[i-1]) {
				duplicate = nums[i];
			}else if( nums[i] > nums[i-1] + 1)
			{
				missing = nums[i-1] +1;
			}
		}
		
		//check if the missing number is at the beginning or end of the array
		if(nums[n-1] != n)
		{
			missing = n;
		}
		
		result[0] = duplicate;
		result[1] = missing;
		
		return result;
	}

	public static void main(String[] args) {
		
		int[] nums = {1,2,2,4};
		int[] result = findErrorNums(nums);
		
		System.out.println("Duplicate : " + result[0]);
		System.out.println("Missing : " +result[1]);

	}

}
