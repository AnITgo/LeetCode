
public class ArrayPairSum {
	public static int arrayPairSum(int[] nums){
		for(int j = 0;j< nums.length;j++){
			for(int i = 0;i<nums.length-j-1; i++){
				if(nums[i]>nums[i+1]){
					int temp = nums[i+1];
					nums[i+1] = nums[i];
					nums[i] = temp;
				}
			}
		}
		
		int output = 0;
		for (int i = 0; i < nums.length-1; i++) {
			if(i%2==0){
				output += nums[i];
			}
		}

		return output;
	}
	public static void main(String[] args){
		int[] nums = {1,3,2,2};
		System.out.println(arrayPairSum(nums));
	}
}	
