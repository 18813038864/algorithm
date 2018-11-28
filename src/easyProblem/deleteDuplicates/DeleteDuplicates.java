package easyProblem.deleteDuplicates;

public class DeleteDuplicates {
	public static ListNode solution(ListNode head){
		if(head==null)return null;
		ListNode pre = head;
		ListNode cur = head.next;
		while(cur!=null){
			if(cur.data == pre.data){
				pre.next = cur.next;
			}else{
				pre = cur;
			}
			cur = cur.next;
		}
		return head;
	}
	public static void main(String args[]){
		DeleteDuplicates dp = new DeleteDuplicates();
		ListNode l1 = dp.new ListNode(1);
		ListNode l2 = dp.new ListNode(1);
		ListNode l3 = dp.new ListNode(3);
		l1.next = l2;
		l2.next = l3;
		dp.printNode(l1);
		dp.printNode(solution(l1));
	}
	public void printNode(ListNode head){
		while(head!=null){
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
	}
	class ListNode{
		int data;
		ListNode next;
		public ListNode(int data){
			this.data = data;
		}
	}
}
