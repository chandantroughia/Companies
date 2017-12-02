package DEShaw;

import java.util.HashMap;

import javax.sound.midi.Synthesizer;

//display the element if the number of occurrences of the element are more than n/2 times
public class MajorityElement {
	
	private static void getMajority(int[] arr) {
		
		int limit = arr.length/2;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < arr.length; i++){
			if(!map.containsKey(arr[i])){
				map.put(arr[i], 1);
			}
			map.put(arr[i], map.get(arr[i]) + 1);
		}
		
		int count = 0;
		for(Integer i: map.keySet()){
			if(map.get(i) > limit){
				System.out.println(i);
				count++;
			}
		}
		
		if(count == 0){
			System.out.println("not found");
			return;
		}
	}

	
	//Boyer-Moore Majority Vote algorithm
	public static void getMajority2(int[] arr){
		
		int limit = arr.length/3;
		int majority_index = 0;
		int count = 1;
		
		for(int i = 1; i < arr.length; i++){
			if(arr[majority_index] == arr[i]){
				count++;
			}
			else{
				count--;
			}
			
			if(count == 0){
				majority_index = i;
				count = 1;
			}
			//System.out.println(majority_index);
		}
		int majorityElement = arr[majority_index];
		
		int newCount = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == majorityElement){
				newCount++;
			}
		}
		
		if(newCount > limit){
			System.out.println(majorityElement);
			return;
		}
		System.out.println("not found");
	}
	
	public static void main(String[] args) {
		int[] arr = {3, 3, 3, 4, 3, 6, 7};
		getMajority(arr);
		getMajority2(arr);
	}
}
