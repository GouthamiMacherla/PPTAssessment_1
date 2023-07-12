package in.ineuron.com;

public class Q2_RemoveElement {
	
	public static int removeElement(int[] numbers , int val) {
		int k =0;//represents the numebr of element not equal to val
		
		for(int i=0 ;i < numbers.length ; i++) {
			if(numbers[i] != val) {
				numbers[k] = numbers[i];
				k++;
			
			}
		}
		return k;
	}
	
	public static void main(String[] args) {
		int[] numbers = {3,2,2,3};
		int val = 3;
		
		int result = removeElement(numbers , val);
		System.out.println("Number of elements not equal to val :: " +result);
	}

}
