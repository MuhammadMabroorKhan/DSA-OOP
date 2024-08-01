
import java.util.*;

import array_stack.Stack;

public class Queue {

	int front;
	int rear;
	int[] a;

	Queue() {

		a = new int[5];
		front = 0;
		rear = -1;

	}

	public void enqueue(int v) {
		if (rear == a.length - 1) {
			System.out.println("Queue already full");
		} else {
			a[++rear] = v;
		}
	}

	public int dequeue() {
		if (rear == -1) {
			System.out.println("Queue is EMpty");
			return -1;
		} else if (front > rear) {
			System.out.println("Queue is empty");
			return -1;
		} else {
			return a[front++];
		}
	}

	public void display() {
		if (front > rear) {
			System.out.println("Queue is EMpty");
			return;
		}

		for (int i = front; i <= rear; i++) {
			System.out.println(a[i]);
		}
	}

	public void deleteAllOccurences(Queue q, int val) {
		Queue temp = new Queue();

		for (int i = q.front; i <= q.rear; i++) {
			int a = q.dequeue();
			if (a != val) {
				temp.enqueue(a);
			}
		}

		q.front = 0;
		q.rear = -1;
		for (int i = temp.front; i <= temp.rear; i++) {
			q.enqueue(temp.dequeue());
		}

		q.display();
	}

	public void reverse(Queue q) {
		Stack temp = new Stack();

		for (int i = q.front; i <= q.rear; i++) {
			temp.push(q.dequeue());
		}

		q.front = 0;
		q.rear = -1;
		while (temp.top != -1) {
			q.enqueue(temp.pop());
		}
		q.display();

	}

	// //

	public void movetoFront(Queue q) {
		Scanner sc = new Scanner(System.in);
		Queue q1 = new Queue();
		Queue q2 = new Queue();

		System.out.println("ENTER INDEX");
		int n = sc.nextInt();
		for (int i = q.front; i <= q.rear; i++) {
			if (i == n) {
				q1.enqueue(q.dequeue());
			} else {
				q2.enqueue(q.dequeue());
			}
		}
		for (int i = q2.front; i <= q2.rear; i++) {
			q1.enqueue(q2.dequeue());
		}

		q1.display();
	}

	public void separateEvennOdd(Queue q) {
		Scanner sc = new Scanner(System.in);
		Queue q1 = new Queue();
		Queue q2 = new Queue();
		int eve = 0;
		int odd = 0;
		for (int i = q.front; i <= q.rear; i++) {
			int a = q.dequeue();
			if (a % 2 == 0) {
				q1.enqueue(a);
				eve++;
			} else {
				q2.enqueue(a);
				odd++;
			}
		}
		q.front = 0;
		q.rear = -1;
		for (int i = q1.front; i <= q1.rear; i++) {
			q.enqueue(q1.dequeue());
		}
		for (int i = q2.front; i <= q2.rear; i++) {
			q.enqueue(q2.dequeue());
		}

		q.display();
		System.out.println("Even " + eve);
		System.out.println("Odd " + odd);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		int ch;
		int val;
		/*
		 * //Queue q1=new Queue();
		 * 
		 * q.enqueue(1); q.enqueue(2); q.enqueue(3); q.enqueue(4); q.enqueue(5);
		 * 
		 * q.display();
		 * 
		 * q.movetoFront(q); q.deleteAllOccurences(q, 2);
		 */
		do {

			Scanner sc = new Scanner(System.in);
			System.out.println("ENTER CHOICE");
			System.out.println("1: ENQUEUE");
			System.out.println("2: DEQUEUE");
			System.out.println("3: DISPLAY");
			System.out.println("4: MOVE TO FRONT");
			System.out.println("5: DELETE OCCURENCES");
			System.out.println("6: REVERSE");
			System.out.println("7: SEPARATE EVEN ODD");
			System.out.println("8: Exit");
			ch = sc.nextInt();

			switch (ch) {
				case 1:
					System.out.println("ENTER VALUE");
					val = sc.nextInt();

					q.enqueue(val);
					break;
				case 2:
					int ab = q.dequeue();
					System.out.println(ab);
					break;
				case 3:
					q.display();
					break;
				case 4:
					q.movetoFront(q);
					break;
				case 5:
					System.out.println("ENTER VALUE");
					val = sc.nextInt();
					q.deleteAllOccurences(q, val);
					break;
				case 6:
					q.reverse(q);
					break;
				case 7:
					q.separateEvennOdd(q);
					break;
				case 8:
					System.exit(0);
			}
		} while (ch != 8);

	}

}
