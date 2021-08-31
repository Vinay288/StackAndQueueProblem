package com.bridgelabz.stackandqueueproblem;
public class MyQueue<K> {
	private K key;
	private INode head;
	private INode tail;

	public MyQueue() {
		this.head = null;
		this.tail = null;
	}

	public void enQueue(INode newNode) {

		if (tail == null)
			this.tail = newNode;
		if (head == null)
			this.head = newNode;
		else
			tail.setNext(newNode);
		tail = newNode;

	}

	public void printMyNodes() {
		INode tempNode = head;
		while (tempNode != null) {
			System.out.print(tempNode.getKey() + "->");
			tempNode = tempNode.getNext();
		}
	}
}
