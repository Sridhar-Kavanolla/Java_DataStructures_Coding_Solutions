import java.util.Arrays;

public class TwoSum_Solution {

	static int[] nums =  {1,2,3,4,5};
	static int target = 9;
	static public int[] result = new int[2];

	public static void main(String []args) {
		twoSum(nums, target);
		System.out.println(Arrays.toString(result));

	}

	public static int[] twoSum(int[] nums, int target) {
	        
	         for(int i=0;i<nums.length-1;i++){
	             for(int j=i+1;j<nums.length;j++)
	             {
	                 if(nums[i]+nums[j]==target)
	                 {
	                     result[0]=i;
	                     result[1]=j;
	                     
	                     return result;
	                 }
	             }
	         }
	         
	         return result;
	         
	     }
}