package Collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show() {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("c");
        queue.add("b");
        queue.add("a");
        // | a -> b -> c |
        queue.offer("j");
        // j is at the rear or at the end of the queue
        // in some implementations when the queue has a limited size,
        // add method will throw an exception but the offer method will just return false.
        // It is more polite in this situations.

        // you can take the item at the front of the queue using the peek() method.
        var front = queue.element(); // If the method is empty. element throws an exception, peek will not.
        var peekFront = queue.peek();   // peek will return NULL;

        // remove will remove the item at the front and it will return it.
        // poll will return NULL if  the queue is empty, but remove throws an exception.
    }
}
