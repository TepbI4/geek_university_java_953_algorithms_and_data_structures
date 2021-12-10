package ru.bg.alekseiterentev;

import ru.gb.alekseiterentev.queue.Deque;

public class LinkedDeque<E> extends LinkedQueue<E> implements Deque<E> {

    @Override
    public boolean insertLeft(E value) {
        Node<E> newNode = new Node<>(value, first, null);
        if (!isEmpty()) {
            first.prev = newNode;
        }
        first = newNode;
        if (isEmpty()) {
            last = first;
        }
        size++;

        return true;
    }

    @Override
    public boolean insertRight(E value) {
        return insert(value);
    }

    @Override
    public E removeLeft() {
        return remove();
    }

    @Override
    public E removeRight() {
        if (isEmpty()) {
            return null;
        }

        Node<E> removedNode = last;
        last = removedNode.prev;
        removedNode.prev = null;
        removedNode.next = null;
        size--;

        if (isEmpty()) {
            first = null;
        }

        return removedNode.item;
    }

    @Override
    public boolean insert(E value) {
        if (isEmpty()) {
            return insertLeft(value);
        }

        Node<E> newNode = new Node<>(value, null, last);
        last.next = newNode;
        last = newNode;
        size++;

        return true;
    }

    @Override
    public E remove() {
        if (isEmpty()) {
            return null;
        }

        Node<E> removedNode = first;
        first = removedNode.next;
        first.prev = null;
        removedNode.next = null;
        size--;

        if (isEmpty()) {
            last = null;
        }

        return removedNode.item;
    }

    @Override
    public E removeFirst() {
        return remove();
    }

    @Override
    public boolean remove(E value) {
        Node<E> current = first;
        Node<E> prev = null;
        Node<E> next = null;

        while (current != null) {
            if (current.item.equals(value)) {
                break;
            }
            prev = current;
            current = current.next;
            next = current.next;
        }

        if (current == null) {
            return false;
        } else if(current == first) {
            removeFirst();
            return true;
        } else if(current == last) {
            last.prev = null;
            last = prev;
            last.next = null;
        }

        prev.next = current.next;
        next.prev = prev;
        current.next = null;
        current.prev = null;
        size--;

        return true;
    }


}
