package Amazon;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
	
	public static int lis(int[] arr){
		
		int[] list = new int[arr.length];
		int i, j, max = 0;
		
		//make a int[] list and add 1 to all the places in it
		Arrays.fill(list, 1);
		
		for(i = 1; i < arr.length; i++){
			for(j = 0; j < i; j++){
				if(arr[i] > arr[j]){
					list[i] = Math.max(list[i], list[j] + 1);
				}
			}
		}
		
		//get max from the new list created
		for(int k = 0; k < list.length; k++){
			if(max < list[k]){
				max = list[k];
			}
		}
		
		return max;
		
	}

	
	public static void main(String[] args) {
		int[] arr = { 10, 22, 9, 33, 21, 50, 41, 60 , 77};
		System.out.println(lis(arr));
		
	}
}
