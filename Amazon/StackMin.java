package Amazon;

public class StackMin {
	
	//Node head;
	int top = -1;
	int maxSize;
	Node[] array = new Node[maxSize];
	
	public StackMin(int maxSize){
		this.maxSize = maxSize;
	}
	
	public class Node{
		int num;
		int min;
		
		public Node(int num, int min){
			this.num = num;
			this.min = min;
			
		}
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
			Node temp = new Node(num,num);
			array[++top] = temp;
		}
		else
			{
			if(num < getMin()){
				Node temp = new Node(num, num);
				array[++top] = temp;
				}
			else
				{
				Node temp = new Node(num, getMin());
				array[++top] = temp;
				}
		}
		
	}
	
	public Node pop(){
		return array[top--];
	}
	
	
	

}
