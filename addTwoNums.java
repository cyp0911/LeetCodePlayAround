//Author:       Yinpeng Chen
//Question:     addTwoNum
//Index:        No.2
//Date:         May-08-2018
//Complexity:	
//Description:	
//				 You are given two linked lists representing two non-negative numbers. 
//				 The digits are stored in reverse order and each of their nodes contain a single digit. 
//				 Add the two numbers and return it as a linked list.




class addTwoNums{
	public static ListNode addTwo(ListNode l1, ListNode l2)
	{
		ListNode dummy = new ListNode(0);
		ListNode cur = dummy;
		int carry = 0;
		while(l1 != null || l2 != null || carry !=0)
		{
			int x = (l1 != null)? l1.val : 0;
			int y = (l2 != null)? l2.val : 0;
			int sum = x + y + carry;
			
			carry = sum / 10;
			sum = sum % 10;
			
			cur.next = new ListNode(sum);
			cur = cur.next;
			
			if (l1 != null) l1 = l1.next;
			if (l2 != null) l2 = l2.next;
			
			
			
		}
		
		return dummy.next;
	}
	
	
	
}