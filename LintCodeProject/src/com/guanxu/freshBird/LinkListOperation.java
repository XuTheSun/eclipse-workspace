package com.guanxu.freshBird;

public class LinkListOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1,1);
		head.next = new ListNode(1,2);
		head.next.next = new ListNode(1,3); 
		head.next.next.next = new ListNode(1,4); 
		head.next.next.next.next = new ListNode(1,5); 
//		head.next.next.next.next.next = new ListNode(5,6); 
//		head.next.next.next.next.next.next = new ListNode(6,7); 
		
		ListNode head1 = new ListNode(9,1);
		head1.next = new ListNode(8,2);
		head1.next.next = new ListNode(8,3); 
		head1.next.next.next = new ListNode(8,4); 
		head1.next.next.next.next = new ListNode(8,5); 
//		head1.next.next.next.next.next = new ListNode(5,6); 
//		head1.next.next.next.next.next.next = new ListNode(6,7); 
//		printList(head);
//		removeElements(head,3);
//		System.out.println("--------------");
//		deleteNode1(head);
//		printList(head);
//		printList(reverse(null));
//		System.out.print(count(head));
		printList(addLists(head,head1));
		
	}
	
	public static int count(ListNode head) {
		if(head == null) 
			return 0;
		int i = 1;
		for(; head.next != null; i++) {
			head = head.next;
		}
		return i;
	}
	
	public static ListNode reverse(ListNode root) {
		ListNode pre, cur, next;
		pre = null;
		cur = root;
		
		if(cur != null) {
			next = root.next;
			while(next != null) {
				cur.next = pre;
				pre = cur;
				cur = next;
				next = cur.next;
				if(next == null)
					cur.next = pre;
			}
		}
		return cur;
		
	}
	
    public static ListNode addLists(ListNode l1, ListNode l2) {
        // write your code here
        ListNode result = new ListNode(0);
        ListNode temp = result;
        int carry = 0;
        int n1, n2, sum;
        while(true){
            n1 = 0;
            n2 = 0;
            if(l1 != null){
                n1 = l1.val;
            }
            if(l2 != null){
                n2 = l2.val;
            }
            sum = n1 + n2 + carry;
            if(sum > 9){
                sum %= 10;
                carry = 1;
            }else{
                carry = 0;
            }
            System.out.println(sum);
            if(l1 != null)
            l1 = l1.next;
            if(l2 != null)
            l2 = l2.next;
            temp.val = sum;
            if(carry == 0 && l1 == null && l2 == null)
                break;
            temp.next = new ListNode(0);
            temp = temp.next;
        }
        return result;
    }
	

	public static ListNode removeElements(ListNode head, int val) {
        // write your code here
		ListNode pre = null;
        ListNode result = head;
        for(;head!=null;head = head.next) {
        	if(head.val == val) {
        		if(pre == null) {
        			result = head.next;
        			continue;
        		}
        		pre.next = head.next;
        		continue;
        	}
        	pre = head;
        }
        return result;
    }
	
	public static void deleteNode1(ListNode node) {
        ListNode temp = node, next = node.next;
        while(next != null){
            if(next.val == 3){
                temp.next = next.next;
                next = temp.next;
                break;
            }
            temp = temp.next;
            next = temp.next;
        }
	}
	
    public static void deleteNode(ListNode node) {
        // write your code here
        ListNode temp = node, next = node.next;
        while(next != null){
            if(next.val == 3){
                temp.next = next.next;
                next = temp.next;
                continue;
            }
            temp = temp.next;
            next = temp.next;
        }
        if(node.val == 3){
            node = node.next;
        }
    }
	
	
	public static ListNode removeElements1(ListNode head, int val) {
        // Write your code here
    if(head==null)
       return head;
    ListNode frist=head,last=head.next;
    while (last!=null) {
        if (last.val==val) {
            frist.next=last.next;
            last = frist.next;
        }else {
            frist = frist.next;
            last = last.next;
        }
    }
    if(head.val==val)
       head = head.next;
    return head;
}
	
	public static void printList(ListNode head) {
		for(;head != null;head = head.next){
			System.out.println(head.num+": "+head.val);
		}
	}
	
	public static ListNode merge(ListNode l1, ListNode l2) {
        ListNode start = new ListNode(0);
        ListNode result = start;
        while(l1 != null || l2 != null){
            if(l1 == null && l2 != null){
                start.next = l2;
                l2 = l2.next;
            }else if (l1 != null && l2 == null){
                start.next = l1;
                l1 = l1.next;
            }else{
                if(l1.val < l2.val){
                    start.next = l1;
                    l1 = l1.next;
                }else if(l1.val >= l2.val){
                    start.next = l2;
                    l2 = l2.next;
                }
            }
            start = start.next;
        }
        return result.next;
	}
}
//Definition for ListNode
class ListNode {
    int val;
    int num;
    public ListNode next;
    public ListNode (int x) {
    	val = x;
    }
    public ListNode(int x, int num) {
    	this.num = num;
        val = x;
        next = null;
    }
}
