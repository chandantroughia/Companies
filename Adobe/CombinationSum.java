package Adobe;


//it is the coin change problem
public class CombinationSum {
	
	private static void printArray(int[] arr){
		for(int i: arr){
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	private static void getCombinations(int[] coins, int amount){
		int[] combinations = new int[amount + 1];
		combinations[0] = 1;
		
		for(int coin: coins){
			for(int i = 1; i < combinations.length; i++){
				if(i >= coin){
					combinations[i] += combinations[i - coin];
				}
			}
			printArray(combinations);
			//System.out.println();
		}
		
		System.out.println(combinations[amount]);
	}
	
	public static void main(String[] args) {
		int[] coins = {2,4,6,8};
		int sum = 8;
		getCombinations(coins, sum);
	}

}
