package others;

public class lutronFizzBuzz {
	
	public static void iterativePrint(int start, int end){
		//while(start <= end){
			if(start % 15 == 0) System.out.println("Lutron");
			else if(start % 3 == 0) System.out.println("Lu");
			else if(start % 5 == 0) System.out.println("tron");
			else System.out.println(start);
			//start++;
		//}
		
	}
	
	public static void recPrint(int start, int end){
		if(start >= end){
			iterativePrint(start, end);
			recPrint(--start, end);
		}
		else return;
	}
	
	
	public static void main(String[] args) {
		//iterativePrint(1, 100);
		//System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		//iterativePrint(100, 1);
		//System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		recPrint(100, 1);
	}

}
