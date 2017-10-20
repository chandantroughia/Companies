package Amazon;

public class StackMin {
	
	int top ;
	int maxSize;
	StackNode[] array;
	
	public StackMin(int Size){
		top = -1;
		maxSize = Size;
		array = new StackNode[maxSize];
	}
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public int getMin(){
		return array[top].min;
	}
	
	
	public void push(int num){
		if(isEmpty())
		{
			StackNode temp = new StackNode(num,num);
			array[++top] = temp;
		}
		else
			{
			if(num < getMin()){
				StackNode temp = new StackNode(num, num);
				array[++top] = temp;
				}
			else
				{
				StackNode temp = new StackNode(num, getMin());
				array[++top] = temp;
				}
		}
		
	}
	
	public StackNode pop(){
		return array[top--];
	}
	
	
	

}
