package easyProblem.removeDuplicatesFromSortedList;


class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates (ListNode head){

        ListNode current = head;
        while (current!=null&&current.next!=null){
            if (current.val ==current.next.val){
                current.next = current.next.next;
            }else {
                current = current.next;
            }
        }
        return head;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(1);
        ListNode node2  = new ListNode(2);
        ListNode node3  = new ListNode(3);
        ListNode node4  = new ListNode(3);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ListNode res = deleteDuplicates(head);
        while (res!=null){
            System.out.print(res.val+" ");
            res = res.next;
        }
    }
}
