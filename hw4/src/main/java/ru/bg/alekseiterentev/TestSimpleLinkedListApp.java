package ru.bg.alekseiterentev;

import java.util.Iterator;

public class TestSimpleLinkedListApp {

    public static void main(String[] args) {
        SimpleLinkedList<Integer> linkedList = new SimpleLinkedList<>();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertFirst(5);
        linkedList.insertFirst(6);
        linkedList.insertFirst(7);
        linkedList.display();

        for (Integer integer : linkedList) {
            System.out.println(integer);
        }

        System.out.println();

        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            System.out.println(integer);
        }
    }
}
