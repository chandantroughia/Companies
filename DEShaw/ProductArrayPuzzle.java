package DEShaw;


//product except itself
public class ProductArrayPuzzle {

	public static int[] getProductArray(int[] arr){
		int[] ans = new int[arr.length];
		
		ans[0] = 1;
		
		for(int i = 1; i < arr.length; i++){
			ans[i] = ans[i - 1] * arr[i - 1];
		}
		
		int right = 1;
		
		for(int i = arr.length - 1; i >= 0; i--){
			ans[i] = ans[i] * right;
			right = right * arr[i];
		}
		
		return ans;
	}
	
	public static void printArray(int[] arr){
		for(int i: arr){
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		printArray(getProductArray(arr));
	}
}
