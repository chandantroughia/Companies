package Microsoft;

public class WithourOperators {
	
	public static int multiply(int a, int b){
		if(b == 0) return 0;
		
		if(b > 0) return (a + multiply(a, b - 1));
		
		else return -multiply(a, -b);
		
	}
	
	public static void main(String[] args) {
		int a = 3;
		int b = 2;
	
		System.out.println("Multiply: " + multiply(a, b));
		//System.out.println("Addition: " + add(a, b));
		
	}

}
