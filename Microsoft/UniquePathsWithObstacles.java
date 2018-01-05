package Microsoft;

public class UniquePathsWithObstacles {

	
	public static int findPaths(int[][] arr){
		int[][] paths = new int[arr.length][arr[0].length];
		
		if(arr[0][0] == 0) paths[0][0] = 1;
		
		for(int i = 1; i < paths.length; i++){
			if(arr[i][0] == 0){
				paths[i][0] = 1;
			}
		}
		
		for(int j = 1; j < paths[0].length; j++){
			if(arr[0][j] == 0){
				paths[0][j] = 1;
			}
		}
		
		for(int i = 1; i < paths.length; i++){
			for(int j = 1; j < paths[0].length; j++){
				if(arr[i][j] == 0){
					paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
				}
			}
		}
		
		return paths[arr.length - 1][arr[0].length - 1];
	}
	
	public static void main(String... args){
	    int[][] array = {{0,0,0},
	                    {0,1,0},
	                    {0,0,0}};

	    System.out.println(findPaths(array));
	  }
}
