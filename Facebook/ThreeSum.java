package Facebook;

import java.util.ArrayList;
import java.util.*;

//Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

//Note: The solution set must not contain duplicate triplets.

//For example, given array S = [-1, 0, 1, 2, -1, -4],

//A solution set is:
//[
//[-1, 0, 1],
//[-1, -1, 2]
//]

public class ThreeSum {
	
	public static ArrayList<ArrayList<Integer>> threeSum(int[] arr){
		
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length - 3; i++){
			if(i == 0 || arr[i] > arr[i - 1]){
				int start = i + 1;
				int end = arr.length - 1;
				
				while(start < end){
					if(arr[i] + arr[start] + arr[end] == 0){
						ArrayList<Integer> tempList = new ArrayList<Integer>();
						tempList.add(arr[i]);
						tempList.add(arr[start]);
						tempList.add(arr[end]);
						
						ans.add(tempList);
					}
					
					if(arr[i] + arr[start] + arr[end] < 0){
						int currentStart = start;
						while(arr[currentStart] == arr[start] && start < end){
							start++;
						}
					}
					
					else{
						int currentEnd = end;
						while(arr[currentEnd] == arr[start] && start < end){
							end--;
						}
					}
					
				}
			}
		}
		
		return ans;
		
	}
	
	
	public static void main(String[] args) {
		int[] arr = {-1, 0, 1, 2, -1, -4};
		System.out.println(threeSum(arr));
	}

}
