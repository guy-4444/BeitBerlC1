package StackQueue;

import java.util.*;

public class StackQueueMain {

    public static void start() {
//        queueFunc();
        stackFunc();
    }

    private static void queueFunc() {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);


        while (queue.iterator().hasNext()) {
            System.out.println(queue.poll());
        }

        System.out.println(queue.size());
    }

    private static void stackFunc() {
        Stack<Integer> stack = new Stack<>();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        stack.add(50);

        while (stack.iterator().hasNext()) {
            System.out.println(stack.pop());
        }

        System.out.println(stack.size());
    }

}
