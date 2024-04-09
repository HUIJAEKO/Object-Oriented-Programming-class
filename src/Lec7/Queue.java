package Lec7;

public class Queue {
    public static void main(String[] args){
        Queue queue = new Queue();
        for (int i = 1; i <= 20; i++)
            queue.enqueue(i);
        while (!queue.empty())
            System.out.print(queue.dequeue() + " ");
    }

    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 8;

    public Queue() {
        this(DEFAULT_CAPACITY);
    }

    public Queue(int capacity) {
        elements = new int[capacity];
    }

    public void enqueue(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    public int dequeue() {
        int returnNumber = elements[0];
        for(int i=0; i<elements.length - 1; i++){
            elements[i] = elements[i+1];
        }
        size--;
        return returnNumber;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
