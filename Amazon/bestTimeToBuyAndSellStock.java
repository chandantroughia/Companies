package Amazon;

public class bestTimeToBuyAndSellStock {
	
	public static int stock(int[] arr){
		int max = 0;
		int min = 0;
		
		for(int i = 1; i < arr.length; i++){
			if(min < arr[i]){
				max = Math.max(max, arr[i] - min);
			}
			else{
				min = arr[i];
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		int[] arr = {7, 1, 5, 3, 6, 4};
		System.out.println(stock(arr));
	}

}
