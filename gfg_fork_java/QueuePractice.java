package gfg_fork_java;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * QueuePractice
 */
public class QueuePractice {
    private static void queue() {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < 10; i++)
            queue.add(i);
        System.out.println(queue);
        System.out.println(queue.peek());
        Queue<Integer> queue2 = new LinkedList<>();
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            queue2.add(queue.remove());
        }
        System.out.println(queue2);
    }

    private static void priorityQueue() {
        Queue<Integer> priorityQ = new PriorityQueue<>();
        priorityQ.add(10);
        priorityQ.add(20);
        priorityQ.add(30);

        System.out.println(priorityQ.peek());
        System.out.println(priorityQ.poll());
        System.out.println(priorityQ.peek());
    }

    public static void main(String[] args) {
        // queue();
        priorityQueue();
    }
}