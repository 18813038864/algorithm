package mergeTwoSortedLists;

import java.util.List;

class ListNode {
    int val;
     ListNode next;
     ListNode(int x) { val = x; }
}

public class MergeTwoSortedLists {
    public static ListNode solution(ListNode l1,ListNode l2){
        if (l1==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }
        ListNode head = null;
        ListNode nNextNode = null;
        ListNode l1NextNode =l1;
        ListNode l2NextNode = l2;
        while (l1NextNode!=null&&l2NextNode!=null){
           ListNode tmp = null;
           if (l1NextNode.val<=l2NextNode.val){
               tmp = l1NextNode;
               l1NextNode = l1NextNode.next;
           }else {
               tmp = l2NextNode;
               l2NextNode = l2NextNode.next;
           }
           if (head==null){
               head =tmp;
               nNextNode = head;
           }else {
               nNextNode.next = tmp;
               nNextNode = nNextNode.next;
           }
        }
        if (l2NextNode==null){
            nNextNode.next = l1NextNode;
        }
        if (l1NextNode==null){
            nNextNode.next = l2NextNode;
        }
        return head;
    }
    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        ListNode l12 = new ListNode(2);
        l1.next = l12;
//        ListNode l1 =new ListNode(2);

        ListNode l2 = new ListNode(1);
        ListNode l22= new ListNode(2);
        ListNode l23 = new ListNode(3);

        l2.next = l22;
        l22.next = l23;

        ListNode res = solution(l1,l2);
        while (res!=null){
            System.out.print(res.val+" ");
            res=res.next;
        }
    }
}
