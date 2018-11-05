package easyProblem.implementStackUsingQueues;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ImplementStackUsingQueue {

    Queue<Integer> data = null;
    /** Initialize your data structure here. */
    public ImplementStackUsingQueue() {
        data = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        data.offer(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        for (int i = 0;i<data.size()-1;i++){
            int ele = data.poll();
            data.offer(ele);
        }

        return data.poll();
    }

    /** Get the top element. */
    public int top() {
        int ele = 0;
        for (int i = 0;i<data.size();i++){
            ele = data.peek();
        }

        return ele;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return  data.isEmpty();
    }

    public static void main(String[] args){
        ImplementStackUsingQueue obj = new ImplementStackUsingQueue();
        obj.push(1);
        int param_2 = obj.pop();
        int param_3 = obj.top();
        boolean param_4 = obj.empty();
    }
}
