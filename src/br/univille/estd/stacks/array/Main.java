package br.univille.estd.stacks.array;


import br.univille.estd.stacks.reverse.CompareNumber;

public class Main {
	
	public static void main(String[] args) {
		CompareNumber comparator = new CompareNumber();
		ArrayStack stack = new ArrayStack();
		stack.setComparator(comparator);
		stack.push(3);
		stack.push(4);
		stack.push(2);
		stack.push(1);
		stack.push(2);
		System.out.println("min "+stack.min());
		stack.pop();
		stack.pop();
		System.out.println("min "+stack.min());
		stack.pop();
		System.out.println("min "+stack.min());
	}
}
