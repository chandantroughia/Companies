package DEShaw;

public class CopySetBitsInARange {

	public static int copySetBitsInARange(int x, int y, int l, int r){
		// l and r must be between 1 to 32
	    if (l < 1 || r > 32)
	        return -1;
	    
	    //get the length of the mask.. take us to the range
	    int maskLength = (1 << (r - l + 1)) - 1;
	    
	    // Shift the mask to the required position
	    // "&" with y to get the set bits at between
	    // l and r in y
	    int mask = (maskLength << (l - 1)) & y;
	    
	    x = x | mask;
	    
	    return x;
	    
	}
	
	public static void main(String[] args) {
		System.out.println(copySetBitsInARange(10, 13, 2, 3));
	}
}
