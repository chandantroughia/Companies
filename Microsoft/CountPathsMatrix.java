package Microsoft;

public class CountPathsMatrix {
	
	//recursion
	public static int getCountRec(int rows, int cols){
		if(rows == 1 || cols == 1) return 1;
		return getCountRec(rows, cols - 1) + getCountRec(rows - 1, cols) + getCountRec(rows - 1, cols - 1);
	}

	//Dynamic Programming
	public static int getCountDP(int rows, int cols){
		int[][] count = new int[rows][cols];
		
		for(int i = 0; i < rows; i++){
			count[i][0] = 1;
		}
		
		for(int j = 0; j < cols; j++){
			count[0][j] = 1;
		}
		
		for(int i = 1; i < rows; i++){
			for(int j = 1; j < cols; j++){
				count[i][j] = count[i][j - 1] + count[i - 1][j] + count[i - 1][j - 1];
			}
		}
		
		return count[rows - 1][cols - 1];
	}
	
	
	public static void main(String[] args) {
		int[][] arr = {{0,0,0},{0,0,0},{0,0,0}};
		int rows = arr.length;
		int cols = arr[0].length;
		System.out.println(getCountRec(rows, cols));
		System.out.println(getCountDP(rows, cols));
	}
}
