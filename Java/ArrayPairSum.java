/*
561. Array Partition I
	Given an array of 2n integers, your task is to group these integers into n pairs of integer, 
	say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
Example:
	Input: [1,4,3,2]
	Output: 4
	Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
Note:
	n is a positive integer, which is in the range of [1, 10000].
	All the integers in the array will be in the range of [-10000, 10000].
*/
public class ArrayPairSum {
	public static int arrayPairSum(int[] nums){
	//冒泡排序，输入过大时，运行超时，算法时间开销大
		for(int j = 0;j< nums.length;j++){
			for(int i = 0;i<nums.length-j-1; i++){
				if(nums[i]>nums[i+1]){
					int temp = nums[i+1];
					nums[i+1] = nums[i];
					nums[i] = temp;
				}
			}
		}
	//.sort 源码探究  排序算法优化
		Arrays.sort(nums);
		
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
