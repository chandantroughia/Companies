package Airbnb;
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.

import java.util.HashMap;

//You may assume that each input would have exactly one solution, and you may not use the same element twice.

//Example:
//Given nums = [2, 7, 11, 15], target = 9,

//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].
public class TwoSum {

	public static int[] twoSum(int[] arr, int target){
		int[] ans = new int[2];
		
		HashMap<Integer, Integer> theMap = new HashMap<>();
		for(int i = 0; i < arr.length; i++){
			if(theMap.containsKey(target - arr[i])){
				ans[1] = i;
				ans[0] = theMap.get(target - arr[i]);
				return ans;
			}
			theMap.put(arr[i], i);
		}
		
		return ans;
	}
	
	public static void printArray(int[] arr){
		for(int i: arr){
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {7, 11, 2, 15};
		int target = 9;
		
		printArray(twoSum(arr, target));
		
	}
}
