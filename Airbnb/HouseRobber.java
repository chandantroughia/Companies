package Airbnb;

/*You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, 
the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and 
it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the 
 maximum amount of money you can rob tonight without alerting the police.
 */


public class HouseRobber {
	
	private static int maxLoot(int[] arr, int len) {
		
		if(len == 0) return 0;
		
		int val1 = arr[0];
		if(len == 1){
			return val1;
		}
		
		int val2 = Math.max(arr[0], arr[1]);
		
		if(len == 2){
			return val2;
		}
		
		int max_val =0;
		
		for(int i = 2; i < len; i++){
			max_val = Math.max(arr[i] + val1, val2);
			val1 = val2;
			val2 = max_val;
		}
		return max_val;

	}
	
	public static void main (String[] args) 
    {
        int[] array = {6, 7, 1, 3, 8, 2, 4};
        int n = array.length;
        System.out.println("Maximum loot value : " + maxLoot(array, n));
    }

}
