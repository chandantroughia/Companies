package Amazon;

import java.util.Arrays;

public class ProductExceptSelf {
	
	public static int[] productExceptSelf(int[] nums){
		
		int temp = 1;
		//Make a array to store the result, first fill 1 in all the places
		int[] product = new int[nums.length];
		Arrays.fill(product, 1);
		
		/* In this loop, temp variable contains product of
        elements on left side excluding nums[i] */
		for(int i = 0; i < nums.length; i++){
			product[i] = temp;
			temp = temp * nums[i];
		}
		
		/*Now do the same for taking the product of elements on the right side excluding nums[i] */
		temp = 1;
		for(int i = nums.length - 1; i >= 0; i--){
			product[i] = product[i] * temp;
			temp = temp * nums[i];
		}
		
		return product;
		
	}
	
	public static void print(int[] arr){
		
		for(int i : arr){
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		
		int[] arr = {1,2,3,4};
		int[] result = productExceptSelf(arr);
		print(result);
	}

}
