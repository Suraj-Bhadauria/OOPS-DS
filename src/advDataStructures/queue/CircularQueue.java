package advDataStructures.queue;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length; //ptr is at last index
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;   // first it will do with end and end++(increment)
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty ");
        }

        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty !");
        }
        return data[front];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        int i=front;
        do{
            System.out.print(data[i] + " -> ");
            i++;
            i%= data.length;
        }while (i!= end);
        System.out.println("END");

    }
}


//Why Do We Use a Circular Queue?
//Circular queues solve a common problem with regular queues: when elements are removed from the front, a regular queue doesn’t automatically shift elements, which can leave unused slots at the beginning. For example, in a regular queue with a capacity of 5, if we add 5 elements and then remove 3, we have 2 elements in the queue but can’t add any more, as it’s considered "full" from the back pointer’s perspective.

//In a circular queue, this problem is fixed by wrapping around: when we reach the end of the array and there’s space at the beginning, we start filling from the front again. This keeps the queue’s capacity fully utilized.
//
