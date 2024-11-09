package advDataStructures.stacks;

import java.util.*;

public class Stacks {
    public static void main(String[] args) {
        // inbuilt
//        Stack<Integer> stack = new Stack<>();
//        stack.push(34);
//        stack.push(44);
//        stack.push(54);
//        stack.push(64);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(3);
//        queue.add(1);
//        queue.add(8);
//        queue.add(6);
//        queue.add(19);
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addLast(76);
        deque.removeFirst();

    }
}
