package DEShaw;

public class SumOfMiddleOfTwoSortedArrays {
	
	public static void leBhai(int[] one, int[] two){
		int ptr = 0;
		int oneIndex = 0, twoIndex = 0;
		int[] arr = new int[one.length + two.length];
		
		while(oneIndex < one.length && twoIndex < two.length){
			if(one[oneIndex] < two[twoIndex]){
				arr[ptr++] = one[oneIndex++];
			}
			else{
				arr[ptr++] = two[twoIndex++];
			}
		}
		
		while(oneIndex < one.length){
			arr[ptr++] = one[oneIndex++];
		}
		
		while(twoIndex < two.length){
			arr[ptr++] = two[twoIndex++];
		}
		
		System.out.println((arr[arr.length/2] + arr[(arr.length/2) + 1]));
		
		for(int i : arr){
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] one = {1, 2, 4, 6, 10};
		int[] two = {4, 5, 6, 9, 12};
		leBhai(one, two);
		
	}

}
