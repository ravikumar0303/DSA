package DoubleLL;

import java.util.*;

public class DoubleLLMain {

	Node head, tail;
	Scanner sc;

	public boolean insertAtBeg() {
//		 Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll No. and Name");
		Student R = new Student(sc.nextInt(), sc.next());
//		Student R=new Student(sc.next)
//             System.out.println("Enter your Name.");         
		Node NN = new Node(R);
		if (NN == null)
			return false;

		if (head == null)
			head = tail = NN;
		else {
			NN.setNext(head);
			head.setPrev(NN);
			head = NN;
		}
		return true;
	}

	public DoubleLLMain() {
		super();
		this.head = head;
		this.tail = tail;
		sc = new Scanner(System.in);
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub

		if (head == null)

			return false;

		return false;
	}

	public void insertAtLast() {
		// TODO Auto-generated method stub


	}

	public void forwordDisplay() {
		// TODO Auto-generated method stub

	}

	public void Display() {
		Node temp = head;

		while (temp != null) {
			System.out.println(temp.getData());

			temp = temp.getNext();
		}

	}

	public void insertAtPos(int i) {
		// TODO Auto-generated method stub

	}

	public void backwordDisplay() {
		// TODO Auto-generated method stub

	}

}
