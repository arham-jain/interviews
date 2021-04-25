package gfg_fork_java;

import java.util.LinkedList;
import java.util.Queue;

/**
 * QueuePractice
 */
public class QueuePractice {
    public static void main(String[] args) {
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
}