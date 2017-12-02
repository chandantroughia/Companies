package Adobe;

public class InvertedStars {
	
	private static void makeStars(int n){
		for(int i=n; i>=1; i--) {
            for(int k=0; k<n-i; k++) {
              System.out.print("-");
            }
            
             for(int j=(2*i - 1); j>=1; j--) {
                 System.out.print("*");
             }
          
            for(int k=0; k<n-i; k++) {
              System.out.print("-");
            }
            
            System.out.println();
         }
       System.out.println("");
	}
	
	public static void main(String[] args) {
		int number = 4;
		makeStars(number);
	}

}
