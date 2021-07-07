package br.univille.estd.stacks.array;

import br.univille.estd.stacks.EmptyStackException;
import br.univille.estd.stacks.Stack;
import br.univille.estd.stacks.reverse.CompareNumber;

import java.util.Comparator;

public class ArrayStack<E> implements Stack<E>{
	
	protected int capacity;
	public static final int CAPACITY = 1000;
	protected E S[];
	protected E min;
	public MinStack minStack;
	protected Comparator comparator;
	protected int top = -1;

	public ArrayStack() {
		this(CAPACITY);
	}
	public ArrayStack(int capacity) {
		this.capacity = capacity;
		S = (E[])new Object[this.capacity];
		this.minStack = new MinStack(capacity);
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
		if (isEmpty()){
			min = element;
			minStack.push(element);
		}
		if (comparator.compare(element, min) == -1) {
			min = element;
			top += 1;
			S[top] = element;
			minStack.push(min);
		}else {
			top += 1;
			S[top] = element;
			minStack.push(min);
		}
	}
	@Override
	public E pop() throws EmptyStackException {
		if (isEmpty()){
			throw new EmptyStackException("Stack vazia");
		}
		E element = S[top];
		S[top] = null;
		top = top - 1;
		minStack.pop();
		return element;
	}

	public void setComparator(Comparator comparator){
		this.comparator = comparator;
	}

	@Override
	public E min() {
		return (E) minStack.top();
	}
}
