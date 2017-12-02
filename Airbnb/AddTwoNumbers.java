package Airbnb;

//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//Output: 7 -> 0 -> 8
/**
* Definition for singly-linked list.
* public class ListNode {
*     int val;
*     ListNode next;
*     ListNode(int x) { val = x; }
* }
*/


public class AddTwoNumbers {
	
	public class ListNode {
		     int val;
		     ListNode next;
		     ListNode(int x) {
		    	 val = x; 
		    }
	}
		 

	public ListNode addTwoNumbers(ListNode l1, ListNode l2){
		
		ListNode prev = null;
		ListNode result = null;
		ListNode temp = null;
		int sum = 0;
		
		while(l1 != null && l2 != null){
			sum = sum / 10;
			
			while(l1 != null){
				sum += l1.val;
				l1 =l1.next;
			}
			
			while(l1 != null){
				sum += l1.val;
				l1 =l1.next;
			}
			
			temp = new ListNode(sum % 10);
			
			if(result ==  null){
				result = temp;
			}else{
				prev.next = temp;
			}
			
			prev = temp;
			
		}
		
		 if(sum / 10 == 1){
	            temp.next = new ListNode(1);
	        }
	        
	        return result;
		
	}
	
}
