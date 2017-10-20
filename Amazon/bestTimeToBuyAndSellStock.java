package Amazon;

public class bestTimeToBuyAndSellStock {
	
	public static int stock(int[] arr){
		
		int max = 0;
		int min = arr[0]; //get min as the first element in arr
		
		for(int i = 1; i < arr.length; i++){
			if(min < arr[i]){		//if min is less than the current element in the array, update max
				max = Math.max(max, arr[i] - min);
			}
			else{					//else update min to current element of array
				min = arr[i];
			}
			//System.out.println(min);
		}
		
		return max;
	}
	

	
	public static void main(String[] args) {
		int[] arr = {7, 2, 5, 3, 6, 4, 1, 2, 14};
		System.out.println(stock(arr));
	}

}
