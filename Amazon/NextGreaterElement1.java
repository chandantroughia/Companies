package Amazon;

import java.util.Stack;

public class NextGreaterElement1 {
	
	private static void getNextLarge(int[] arr, int n)
	{
		int i = 0;
		int current, next;
		Stack<Integer> theStack = new Stack<Integer>();
		
		//Push the first element to the stack
		theStack.push(arr[0]);
		
		for( i = 1; i < n; i++)
		{
			//make next as the next element in the array
			next = arr[i];
			
			//pop the element from the stack and check if it is smaller than the next, if yes print the result.
			//keep doing this till the stack is empty or the condition is satisfied
			if(!theStack.isEmpty()){
				current = theStack.pop();
				
				while(current < next)
				{
					System.out.println(current + "--->" + next);
					if(theStack.isEmpty()){
						break;
					}
					
					current = theStack.pop();
				}
				
				if(current > next)
				{
					theStack.push(current);
				}
			}
			// push next to the stack as well, because we have to find the next greater for it as well
			theStack.push(next);
		}
		
		while(!theStack.isEmpty()){
			current = theStack.pop();
			next = -1;
			System.out.println(current + "--->" + current);
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,1,4,5,2,3,6};
		getNextLarge(arr, arr.length);
	}
}
