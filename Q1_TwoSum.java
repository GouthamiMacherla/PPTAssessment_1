package in.ineuron.com;

import java.util.Map;
import java.util.HashMap;

public class Q1_TwoSum {

	public static int[] twoSum(int[] numbers , int target) {
		
		//create a HAshMap to store the number-to-index mapping
		Map<Integer , Integer>  numMap = new HashMap<>(); 
		
		
		//Iterate through the array
		for(int i =0 ;i<numbers.length ; i++) {
			int complement = target - numbers[i];
			
			
			//check if the complement exists in the map
			if(numMap.containsKey(complement)) {
				//return the indices of the two numbers
				return new int[] {
						numMap.get(complement), i};
				}
			//Add the current number and its index to the map
			numMap.put(numbers[i],i);
			}
		  //no solution found ,return an empty array
		 return new int[0];
	}
	public static void main(String[] args) {
		int[] numbers = {2,7,11,15};
		int target = 9;
		
		int[] indices = twoSum(numbers , target);
		
		//print the indices of the two numbers
		System.out.println("Indices :"  +indices[0] + " ," +indices[1]);
		
	}

}
