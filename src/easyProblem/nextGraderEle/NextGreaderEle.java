package easyProblem.nextGraderEle;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaderEle {

    public int[] nextGreaterElement(int[] findNums, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }
        for (int i = 0; i < findNums.length; i++)
            findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;
    }

    public static void main(String[] args){

    }
}
