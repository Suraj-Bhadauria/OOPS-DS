package advDataStructures.stacks;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
        // here 'this' keyword is acting like the constructor declared below
        // it is also a functionality of this
        // so a CustomsTack will be initialized with size 10
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    // functions
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full !");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException(" cannot pop from an empty stack !!");
        }
//        int removed = data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];
    }
    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("stack is empty !");
        }

        return data[ptr];
    }

    protected boolean isFull(){
        return ptr == data.length-1; //ptr is at last index
    }
    private boolean isEmpty(){
        return ptr == -1;
    }






}
