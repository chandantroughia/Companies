package Adobe;

import java.util.ArrayList;

public class MedianInAStream {
	
	private static int getMedian(ArrayList<Integer> theList){
		
		int len = theList.size();
		if(len % 2 == 0){
			return (theList.get(len/2) + theList.get(len/2 - 1))/len;
		}
		else{
			return theList.get(len/2)/len;
		}
		
	}
	
	
	private static void printMedian(ArrayList<Integer> theList, int number){
		
		
		int median = getMedian(theList);
		
		System.out.println("Push " + number + ", Median: " + median + " for list: " + theList);
		
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 15, 1, 3};
		ArrayList<Integer> theList  = new ArrayList<Integer>();
		for(int i = 0; i < arr.length; i++){
			theList.add(arr[i]);
			printMedian(theList, arr[i]);
		}
	}

}
