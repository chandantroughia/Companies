package DEShaw;
import java.util.*;

public class MinimumPlatforms {
	
	private static int getPlatforms(int[] arr, int[] dep){
		Arrays.sort(arr);;
		Arrays.sort(dep);
		
		int platforms = 1, result = 1;
		int i = 1, j = 0;
		
		while(i < arr.length && j < dep.length){
			if(arr[i] < dep[j]){
				platforms++;
				i++;
				
				if(platforms > result){
					result = platforms;
				}
			}
			else{
				platforms--;
				j++;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr = {900, 940, 950, 1100, 1500, 1800};
		int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
		
		System.out.println(getPlatforms(arr, dep));
	}

}
