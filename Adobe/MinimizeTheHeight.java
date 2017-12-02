package Adobe;

public class MinimizeTheHeight {
	
	private static int minimize(int[] arr, int k){
		for(int i = 0; i < arr.length; i++){
			if(arr[i] < 6){
				arr[i]  = arr[i] + k;
			}
			else{
				arr[i] = arr[i] - k;
			}
		}
		
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i = 0; i< arr.length; i++){
			if(arr[i] < min){
				min = arr[i];
			}
			
			if(arr[i] > max){
				max = arr[i];
			}
		}
		
		System.out.println(max + " - " + min);
		
		return max - min;
		
	}
	
	
	public static void main(String[] args) {
		int[] arr = {100, 150, 200, 250, 300, 400};
		int k = 4;
		System.out.println(minimize(arr, k));
	}

}
