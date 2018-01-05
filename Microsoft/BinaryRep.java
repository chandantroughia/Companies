package Microsoft;

public class BinaryRep {
	
	public static void binaryRep(int n){
		if(n > 1){
			binaryRep(n/2);
		}
		System.out.print(n % 2);
	}
	
	public static void main(String[] args) {
		int n = 10;
		binaryRep(n);
	}

}
