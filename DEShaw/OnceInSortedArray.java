package DEShaw;

public class OnceInSortedArray {

	//Using XOR
	public static int findNumber(int[] arr){
		
		int ans = 0;
		for(int i: arr){
			ans ^= i;
		}
		
		return ans;
		
	}
	
	
	//Using sort property
	public static int findNumber2(int[] arr){
			
		for(int i = 0; i < arr.length - 1; i += 2){
			if(arr[i] != arr[i + 1]){
				return arr[i];
			}
		}
		
		return arr[arr.length - 1];
			
	}

	
	
	public static void main(String[] args) {
		
		int[] arr = {1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65};
		System.out.println(findNumber(arr));
		System.out.println(findNumber2(arr));

	}
}
