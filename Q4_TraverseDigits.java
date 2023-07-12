package in.ineuron.com;

public class Q4_TraverseDigits {
	
	public static int[] plusOne(int[] digits)
	{
		int n = digits.length;
		
		//Traverse the digits from right to left
		for(int i=n-1 ;i >= 0;i++)
		{
			//if the current digit is less than 9 ,we can simply increment it and return the digits
			
			if(digits[i] < 9)
			{
				digits[i]++;
				return digits;
			}
			//if the current digit is 9,set it to 0and continue to the next
			digits[i] = 0 ;
		}
		//if we reach this point ,it means all digits were 9
		//in this case , we need to create a new array with one addittional elemnet
		
		int[] result = new int[n+1];
		result[0] = 1;
		return result;
	}

	public static void main(String[] args) {
		
		int[] digits = {9,9,9};
		int[] result = plusOne(digits);
		System.out.println("Result : ");
		for(int digit : result) {
			System.out.print(digit + "  ");
		}

	}

}
