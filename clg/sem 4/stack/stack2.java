import java.util.*;

public class stack2 {

    private int[] items;
    private int front;
    private int rear;

    public class Queue {

        public Queue(int size) {
            items = new int[size];
            front = -1;
            rear = -1;
        }
    }

    public Boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public void addFront(int data) {
        if (isEmpty()) {
            front = rear = 0;
        } else if (front == 0) {
            front = items.length - 1;
        } else {
            front--;
        }
        items[front] = data;
        items[front] = data;
    }

    public void addRear(int data) {
        if (isEmpty()) {
            front = rear = 0;
        } else if (rear == items.length - 1) {
            rear = 0;
        } else {
            rear++;
        }
        items[rear] = data;
    }

    public int removeFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }

        int removed = items[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % items.length;
        }

        return removed;
    }

    public int removeRear() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }

        int removed = items[rear];
        if (front == rear) {
            front = rear = -1;
        } else if (rear == 0) {
            rear = items.length - 1;
        } else {
            rear--;
        }
        return removed;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("empty");
            return;
        }
        int index = front;
        while (!isEmpty()) {
            System.out.println(removeFront());
        }
    }

    public static void main(String[] args) {
        stack2 s = new stack2();
        s.addFront(1);
        s.addFront(2);
        s.addFront(3);
        s.addFront(4);

        s.display();
    }
}
