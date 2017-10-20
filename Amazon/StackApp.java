package Amazon;

public class StackApp {
	
	public static void main(String[] args) {
		
		StackMin theStack = new StackMin(3);
		
		theStack.push(1);
		theStack.push(2);
		theStack.push(-1);
		
		System.out.println(theStack.getMin());
		
		theStack.pop();
		
		System.out.println(theStack.getMin());
		
		
	}

}
