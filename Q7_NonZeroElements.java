package in.ineuron.com;

public class Q7_NonZeroElements {
	
	public static void moveZeros(int[] nums)
	{
		int i =0 ;//pointer to track the position to place non-zero elements
		
		//Traverse the array and move non-zero elements to the front
		for(int num : nums) {
			 if( num != 0)
			 {
				 nums[i] = num;
				 i++;
			 }
		}
		//fill the remaining positions with zeros
		
		while(i < nums.length)
		{
			nums[i] = 0;
			i++;
		}
	}

	public static void main(String[] args) {
		
		int[] nums = {0,1,0,3,12};
		moveZeros(nums);
		
		System.out.print("Result : ");
        for (int num : nums)
        {
        	System.out.print(num + "");
        }
	}

}
