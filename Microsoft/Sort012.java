package Microsoft;

public class Sort012 {
	
	private static void sort012(int[] arr){
		int low = 0;
		int mid = 0;
		int high = arr.length - 1;
		
		while(mid <= high){
			switch(arr[mid]){
			case 0:
				swap(arr, low++, mid++);
				break;
			case 1:
				mid++;
				break;
			case 2:
				swap(arr, mid, high--);
				break;
			}
		}
	}
	
	private static void swap(int[] arr, int i , int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	private static void printArray(int[] arr) {
		for(Integer i: arr){
			System.out.print(i + " ");
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		sort012(arr);
		printArray(arr);
	}

}
