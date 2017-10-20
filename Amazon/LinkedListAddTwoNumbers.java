package Amazon;

import Amazon.LinkedList.Node;

public class LinkedListAddTwoNumbers {
	
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int data;
	 *     ListNode next;
	 *     ListNode(int x) { data = x; }
	 * }
	 */
	
	
	public Node addTwoNumbers(Node one, Node two){
		Node temp = null, prev = null, res = null;
        int sum = 0;
        while(one != null || two != null){
            sum /= 10;
            if(one != null){
                sum += one.data;
                one = one.next;
            }
            
            if(two != null){
                sum += two.data;
                two = two.next;
            }
            
            temp = new Node(sum % 10);
            
            if(res == null){
                res = temp;
            }
            else{
                prev.next = temp;
            }
            
            prev = temp;
        }
        
        if(sum / 10 == 1 ){
            temp.next = new Node(1);
        }
        
        return res;
	}

}
