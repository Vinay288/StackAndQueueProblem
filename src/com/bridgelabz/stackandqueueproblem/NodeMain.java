package com.bridgelabz.stackandqueueproblem;

public class NodeMain {

	public static void main(String[] args) {
		Node<Integer> firstNode = new Node<>(70);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(56);
		MyStack<Integer> myStack = new MyStack<Integer>();
		myStack.push(firstNode);
		myStack.push(secondNode);
		myStack.push(thirdNode);
		myStack.printMyNodes();
	}

}
