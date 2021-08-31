package com.bridgelabz.stackandqueueproblem;

public class NodeMain {

	public static void main(String[] args) {
		Node<Integer> firstNode = new Node<>(70);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(56);
		MyStack<Integer> myStack = new MyStack<Integer>();
		MyQueue<Integer> myQueue = new MyQueue<Integer>();
		myQueue.enQueue(firstNode);
		myQueue.enQueue(secondNode);
		myQueue.enQueue(thirdNode);
		myQueue.printMyNodes();
		myQueue.dequeue();
		myQueue.dequeue();
	}

}
