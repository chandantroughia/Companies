package Microsoft;

public class TransformTheArray {

	
	public static void printArray(int[] arr){
		for(int i: arr){
			System.out.print(i + " ");
		}
	}
	
	public static void transForm(int[] arr){
		
		int prev = 0;
		int i;
		for(i = 1; i < arr.length; i++){
			if(arr[i] != 0){
				if(arr[i] != arr[prev]){
					prev++;
				}else{
					arr[prev] = 2*arr[prev];
					arr[i] = 0;
					prev = i;
				}
			}
		}
		
		int count = 0;
		for(int k = 0; k < arr.length; k++){
			if(arr[k] != 0){
				arr[count++] = arr[k];
			}
		}
		
		while (count < arr.length)
            arr[count++] = 0;
		
		printArray(arr);
		
	}
	//2 4 10 4 8 12 8 0 0 0 0 0
	public static void main(String[] args) {
		int[] arr = {2, 4, 5, 0, 0, 5, 4, 8, 6, 0, 6, 8};
		transForm(arr);
	}
}
