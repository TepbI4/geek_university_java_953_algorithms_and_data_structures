package ru.bg.alekseiterentev;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class SimpleLinkedList<E> implements LinkedList<E> {

    protected Node<E> first;
    protected int size;

    @Override
    public void insertFirst(E value) {
        first = new Node<>(value, first);
        size++;
    }

    @Override
    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }

        Node<E> removedNode = first;
        first = removedNode.next;
        removedNode.next = null;
        size--;

        return removedNode.item;
    }

    @Override
    public boolean remove(E value) {
        if (isEmpty()) {
            return false;
        }

        Node<E> current = first;
        Node<E> prev = null;

        while (nonNull(current)) {
            if (current.item.equals(value)) {
                break;
            }
            prev = current;
            current = current.next;
        }

        if (isNull(current)) {
            return false;
        } else if (current == first) {
            removeFirst();
            return true;
        }

        prev.next = current.next;
        current.next = null;
        size--;

        return true;
    }

    @Override
    public boolean contains(E value) {
        if (isEmpty()) {
            return false;
        }

        Node<E> current = first;
        while (nonNull(current)) {
            if (current.item.equals(value)) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public E getFirst() {
        return first.item;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        Node<E> current = first;
        while (nonNull(current)) {
            sb.append(current.item);
            if (nonNull(current.next)) {
                sb.append(" -> ");
            }
            current = current.next;
        }
        sb.append("]");

        return sb.toString();
    }
}
