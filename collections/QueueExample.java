package collections;

import java.util.*;

public class QueueExample {
    public static void main(String[] args) {

        System.out.println("Queue: ");
        Queue<String> queue = new LinkedList<>();
        queue.offer("Adam");
        queue.offer("Bartek");
        queue.offer("Damian");
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.peek());
        // System.out.println(queue.element());

        System.out.println("\n\nDeque: ");
        Deque<String> deque = new ArrayDeque<>();
        deque.offer("Adam");
        deque.offer("Bartek");
        System.out.println(deque);
        deque.offerFirst("Paweł");
        System.out.println(deque);
        deque.offerLast("Damian");
        System.out.println(deque);
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        deque.offerFirst("Paweł");
        deque.offerFirst("Paweł");
        System.out.println(deque);

        System.out.println("\n\nStack: ");
        final Stack<String> stack = new Stack<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("2");
        System.out.println(stack);
        System.out.println(stack.pop()); //zwraca nam obiekt z usuwaniem go
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        // .peek zwraca nam obiekt bez usuwania go
        // .push dodaje element do stosu


        System.out.println("\n\nPriority Queue: ");
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer("2");
        priorityQueue.offer("4");
        priorityQueue.offer("1");
        priorityQueue.offer("3");

        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

        final PriorityQueue<Person> people = new PriorityQueue<>();
        people.offer(new Person("Adam"));
        people.offer(new Person("Bartek"));
        people.offer(new Person("Adam"));

        System.out.println(people);
        System.out.println(people.poll());
        System.out.println(people.poll());
        System.out.println(people.poll());
    }
}
