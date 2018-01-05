package Microsoft;
import java.util.*;

public class SortEvenOdd {
	public static void sortEvenOdd(int[] arr){
	      int l = 0, r = arr.length - 1;
	      int k = 0;
	      while(l < r){
	        while(arr[l] % 2 != 0){
	          l++;
	          k++;
	        }

	        while(arr[r] % 2 == 0 && l < r){
	          r--;
	        }

	        if(l < r){
	          int temp = arr[l];
	          arr[l] = arr[r];
	          arr[r] = temp;
	        }
	      }

	      Arrays.sort(arr, 0, k);
	      Arrays.sort(arr, k, arr.length);
	      reverse(arr, 0, k - 1);

	  }
	
	private static void reverse(int[] arr, int i, int j){
		while(i < j){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
	public static void printArray(int[] arr){
		for(Integer i: arr){
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args){
	    int[] arr = {1, 3, 2, 7, 5, 4};

	    sortEvenOdd(arr);
	    printArray(arr);
	  }
}
