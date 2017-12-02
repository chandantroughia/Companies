package DEShaw;

import java.util.Arrays;

public class WaterOverflow {
	
	public static double getQuantity(int i, int j, double water){
		// A row number i has maximum i columns. So input column number must
	    // be less than i
		if(j > i) return -1;
		
		//number of total glasses based on the value of i
		double[] glasses = new double[(i * (i + 1))/2];
		//fill with 0
		//Arrays.fill(glasses, 0);
		
		//put all the water in the first glass
		int index = 0;
		glasses[index] = water;
		
		// Now let the water flow to the downward glasses till the
	    // amount of water X is not 0 and row number is less than or
	    // equal to i (given row)
		for(int row = 1; row <= i && water >= 0; row++){
			//we know the number of columns is equal to number of rows
			for(int col  = 1; col <= row; col++, index++){
				//get the water from the current glass
				water = glasses[index];
				//put the capacity in the glass and use other to fill other glasses
				glasses[index] = (water > 1) ? 1 : water;
				
				water  = (water > 1) ? water - 1: 0;
				
				//distribute the rest to the below two glasses
				if(index + row < glasses.length){
					glasses[index + row] += water / 2;
				}
				if(index + row + 1< glasses.length){
					glasses[index + row + 1] += water / 2;
				}
			}
		}
		
		return glasses[i*(i-1)/2 + j - 1];
		
	}
	
	public static void main(String[] args) {
		int i = 2, j = 2;
		double water = 2.0;
		System.out.println(getQuantity(i, j, water));
	}

}
