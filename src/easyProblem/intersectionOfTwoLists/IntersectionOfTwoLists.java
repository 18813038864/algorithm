package easyProblem.intersectionOfTwoLists;


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class IntersectionOfTwoLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null||headB==null){
            return null;
        }

        ListNode pointA = headA;
        ListNode pointB = headB;
        boolean changeA = false;
        boolean changeB = false;
        while (changeA==false||changeB==false){
            if (!changeA||!changeB){
                pointA = pointA.next;
                pointB = pointB.next;
            }

            if (pointA==null){
                pointA = headB;
                changeA=true;
            }
            if (pointB==null){
                pointB = headA;
                changeB=true;
            }
        }
        while (pointA!=null){
            pointA = pointA.next;
            pointB = pointB.next;
            if (pointA==pointB){
                return pointA;
            }
        }

        return null;
    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        while (tempA != null && tempB != null) {
            if (tempA == tempB) {
                return tempA;
            }
            if (tempA.next == null) {
                tempA = headB;
                tempB = tempB.next;
                continue;
            }
            if (tempB.next == null) {
                tempB = headA;
                tempA = tempA.next;
                continue;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return null;
    }


    public static void main(String[] args){

    }
}
