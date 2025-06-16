//Program to implement queue in Java

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListQueue {
    private int front;
    private int rear;
    private int size;
    private ArrayList<Integer> queue;

    public ArrayListQueue(int size) {
        front = 0;
        rear = 0;
        this.size = size;
        queue = new ArrayList<>();
    }

    /**
     * Returns the number of items in the queue
     * @return the item count in queue
     */
    private int count(){
        return queue.size();
    }

    private boolean isQueueEmpty(){
        if (count() == 0){
            return true;
        }
        return false;
    }

    private boolean isQueueFull(){
        if (count() == size){
            return true;
        }
        return false;
    }

    private void enqueue(int item) throws Exception {
        if (isQueueFull())
            throw new Exception("The queue is full!");
        else {
            queue.addLast(item);
        }
    }

    private void dequeue() throws Exception {
        if (isQueueEmpty())
            throw new Exception("The queue is empty!");
        else {
            System.out.printf("The dequeued item is: %d\n", queue.getFirst());
            queue.removeFirst();
        }
    }


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of queue:\t");
        int length = scanner.nextInt();
        ArrayListQueue queue = new ArrayListQueue(length);
        System.out.printf("The number of items in queue is: %d\n", queue.count());
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        System.out.printf("The size of queue is: %d\n", queue.count());
        queue.dequeue();
        queue.dequeue();
        System.out.print("The resulting queue is:\n");
        for (Integer items: queue.queue)
            System.out.println(items);

    }
}
