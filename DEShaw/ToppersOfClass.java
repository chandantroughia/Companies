package DEShaw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ToppersOfClass {
	
	public static ArrayList<Integer> findToppers(int[] arr, int k){
		
		HashMap<Integer, ArrayList<Integer>> theMap = new HashMap<Integer, ArrayList<Integer>>();
		
		for(int i = 0; i< arr.length; i++){
			if(!theMap.containsKey(arr[i])){
				theMap.put(arr[i], new ArrayList());
			}
			
			ArrayList<Integer> subList = theMap.get(arr[i]);
			subList.add(i);
			theMap.put(arr[i], subList);
		}
		
		for(Integer i: theMap.keySet()){
			System.out.println(i + "-->" + theMap.get(i));
		}
		
		Arrays.sort(arr);
		int n = 0;
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		for(int i = arr.length - 1; i >= 0 &&  n < k; i--){
			if(theMap.containsKey(arr[i])){
				ArrayList<Integer> temp = theMap.get(arr[i]);
				int t = 0;
				while(t < temp.size() && n < k){
					ans.add(temp.get(t));
					t++;
					n++;
				}
			}
		}
		
		return ans;
	}

	
	public static void main(String[] args) {
		int[] arr = {2, 2, 1, 3, 1};
		
		int k = 3;
		
		System.out.println(findToppers(arr, k));
	}
}
