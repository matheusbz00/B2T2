package br.univille.estd.stacks.array;

import br.univille.estd.stacks.EmptyStackException;
import br.univille.estd.stacks.Stack;

import java.util.Comparator;

public class MinStack<E> implements Stack<E> {

    protected int capacity;
    protected E S[];
    protected int top = -1;

    public MinStack(int capacity) {
        this.capacity = capacity;
        S = (E[])new Object[this.capacity];
    }
    @Override
    public int size() {
        return top+1;
    }
    @Override
    public boolean isEmpty() {
        return (top < 0);
    }
    @Override
    public E top() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException("Stack vazia");
        }
        return S[top];
    }
    @Override
    public void push(E element) {
        if (size() == capacity) {
            throw new FullStackException("Stack cheia");
        }
        top += 1;
        S[top] = element;
    }
    @Override
    public E pop() throws EmptyStackException {
        if (isEmpty()){
            throw new EmptyStackException("Stack vazia");
        }
        E element = S[top];
        S[top] = null;
        top = top - 1;
        return element;
    }

    @Override
    public E min() {
        return null;
    }
}
