package ru.gb.alekseiterentev;

import ru.gb.alekseiterentev.queue.impl.DequeImpl;

public class Test3 {

    public static void main(String[] args) {
        testQueue();
    }

    private static void testQueue() {
        DequeImpl<Integer> queue = new DequeImpl<>(5);

        System.out.println("add element: " + queue.insert(34));
        System.out.println("add element: " + queue.insert(12));
        System.out.println("add element: " + queue.insert(20));
        System.out.println("add element: " + queue.insert(16));
        System.out.println("add element: " + queue.insert(14));
        System.out.println("add element: " + queue.insert(17));

        queue.display();
        System.out.println("remove: " + queue.remove());
        queue.display();
        System.out.println("remove: " + queue.removeRight());
        queue.display();
        System.out.println("remove: " + queue.removeLeft());
        queue.display();

        System.out.println("add element: " + queue.insertLeft(18));
        queue.display();

        System.out.println("add element: " + queue.insertLeft(1));
        queue.display();

    }

}
