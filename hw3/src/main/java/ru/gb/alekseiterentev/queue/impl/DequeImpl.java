package ru.gb.alekseiterentev.queue.impl;

import ru.gb.alekseiterentev.queue.Deque;

public class DequeImpl<E> extends QueueImpl<E> implements Deque<E> {
    public DequeImpl(int maxSize) {
        super(maxSize);
    }

    @Override
    public boolean insertLeft(E value) {
        if (isFull() || head - 1 == DEFAULT_HEAD) {
            return false;
        }

        data[--head] = value;
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

        if (tail == 1) {
            tail = DEFAULT_TAIL;
        }

        E value = data[tail--];
        size--;
        return value;
    }
}
