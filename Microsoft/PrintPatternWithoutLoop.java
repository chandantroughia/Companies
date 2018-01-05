package Microsoft;

public class PrintPatternWithoutLoop {
	public static void printPattern(int num){
	    if(num == 0 || num < 0){
	      System.out.print(num + " ");
	      return;
	    }

	    System.out.print(num + " ");
	    printPattern(num - 5);
	    System.out.print(num + " ");
	  }


	  public static void main(String[] args){
	    int number = 16;
	    printPattern(number);
	    System.out.println();
	  }
}
