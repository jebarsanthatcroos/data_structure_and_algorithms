public class CircularQueue {
    int[] queue;
    private int front = -1, rear = -1;

    public CircularQueue(int size) {
        queue = new int[size];
    }

    private boolean isEmpty() {
        return front == -1;
    }
    private boolean isFull() {
        return (rear + 1) % queue.length == front;
    }

    public void Enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % queue.length;
        }

        queue[rear] = data;
    }

    public int Dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int data = queue[front];

        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % queue.length;
        }

        return data;
    }

    public int frontElement() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        return queue[front];
    }

    public void Display() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return;
        }

        int i = front;

        while (true) {
            System.out.print(queue[i] + " ");

            if (i == rear)
                break;

            i = (i + 1) % queue.length;
        }

        System.out.println();
    }
}