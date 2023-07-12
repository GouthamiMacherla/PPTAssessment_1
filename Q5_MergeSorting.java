package in.ineuron.com;

public class Q5_MergeSorting {
	
	public static void merge(int[] nums1 , int m ,int[] nums2 , int n) {
		
		int index = m+n-1;
		
		//merge the arrays from right to left
		
		while(m > 0 && n > 0) {
			//compare the last elements of nums1 and nums
			if(nums1[m-1] >= nums2[n-1]) {
				nums1[index] = nums1[m-1];
				m--;
			}else {
				nums1[index] = nums2[n-1];
				n--;
			}
			index--;
		}
		
		//if there are remaining elements in nums2 ,copy them to nums1
		while(n > 0) {
			nums1[index] = nums2[n-1];
			n--;
			index--;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int[] nums1 = {1,2,3,0,0,0};
		int m = 3;
		int[] nums2 =  {2,5,6};
		int n=3;
		merge(nums1, m , nums2 , n);
		
		System.out.println("Merged Array : " );
		for(int num : nums1)
		{
			System.out.print(num + " ");
		}
	}

}
