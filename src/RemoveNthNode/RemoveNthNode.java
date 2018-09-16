package RemoveNthNode;

class ListNode{
	int val;
	ListNode next;
	public ListNode(int val){
		this.val = val;
	}
}
public class RemoveNthNode {
	public static ListNode solution(ListNode a,int n){
		ListNode dummy = new ListNode(0);
		dummy.next = a;
		ListNode first = a;
		int len = 0;
		while(first!=null){
			len++;
			first= first.next;
		}
		len = len-n;
		first = dummy;
		while(len>0){
			len--;
			first = first.next;
		}
		first.next = first.next.next;
		return dummy.next;
	}
	public static void printNode(ListNode a){
		while(a!=null){
			System.out.print(a.val+" ");
			a = a.next;
		}
		System.out.println();
	}
	
	public static void main(String args[]){
		ListNode head =new ListNode(1);
		ListNode l2 = new ListNode(2);
		head.next = l2;
		
		printNode(head);// 1,2
		printNode(solution(head,2));//1 ,2
		//System.out.println(rmNode.solution(head,2));
	}
	
}

