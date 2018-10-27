package easyProblem.reverseLinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class ReverseLinkedList {

    //the iteratively
    public ListNode reverseList(ListNode head) {
        ListNode before = null;
        ListNode cur = head;
        ListNode next = null;
        while (cur!=null){
            next = cur.next;
            cur.next = before;
            before = cur;
            cur = next;
        }

        return before;
    }
    //the recursively
    public ListNode reverseLis2(ListNode head) {
        return recursive(head,null);
    }

    public ListNode recursive(ListNode head,ListNode before){
        if (head==null){
            return before;
        }
        ListNode next = head.next;
        head.next = before;
        before = head;
        return recursive(next,before);
    }

    public static void main(String[] args){

    }
}
