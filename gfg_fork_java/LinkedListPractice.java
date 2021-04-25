package gfg_fork_java;

import java.util.LinkedList;

/**
 * LinkedList
 */
public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println(linkedList);

        linkedList.remove(3);
        linkedList.removeFirst();
        System.out.println(linkedList);
    }
}