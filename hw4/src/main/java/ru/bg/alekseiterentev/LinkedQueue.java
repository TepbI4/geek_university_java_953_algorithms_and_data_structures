package ru.bg.alekseiterentev;

import ru.gb.alekseiterentev.queue.Queue;

import java.util.Iterator;

public class LinkedQueue<E> extends SimpleLinkedList<E> implements Queue<E> {

    protected Node<E> last;

    @Override
    public boolean insert(E value) {
        if (isEmpty()) {
            insertFirst(value);
            return true;
        }

        Node<E> newNode = new Node<>(value, null);
        last.next = newNode;
        last = newNode;
        size++;

        return true;
    }

    @Override
    public E remove() {
        E removedValue = super.removeFirst();

        if (isEmpty()) {
            last = null;
        }

        return removedValue;
    }

    @Override
    public E peekFront() {
        return super.getFirst();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean remove(E value) {
        Node<E> current = first;
        Node<E> prev = null;

        while (current != null) {
            if (current.item.equals(value)) {
                break;
            }
            prev = current;
            current = current.next;
        }

        if (current == null) {
            return false;
        } else if(current == first) {
            removeFirst();
            return true;
        } else if(current == last) {
            last = prev;
            last.next = null;
        }

        prev.next = current.next;
        current.next = null;
        size--;

        return true;
    }
}
