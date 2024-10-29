package oops.generics;

//Generics do not support creating arrays of type T at runtime due to type erasure.
//Object[] provides flexibility to hold any type of object while allowing us to use generics with proper casting.


//Summary:
//The Object class acts as a universal superclass in Java, allowing us to store elements of any type.
//Since Java does not allow direct generic arrays, Object[] is used to store data, and elements are cast back to T when needed.
//This workaround ensures that the custom generic array list behaves like a generic collection while conforming to Java's type system.
//import java.util.Arrays;

import java.util.Arrays;

public class CustomGenArrayList<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;        //also working as index value

    public CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }
    //Here, we initialize the data array as Object[] because Java does not allow T[] data = new T[DEFAULT_SIZE]; directly.
//    This array can store any object type because every class in Java is derived from Object.

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;     // as it will put the element at the position of num(which is equal to size, we want that bcoz array starts from zero, so if there are 2 elements (size=2), that means the index on which new element will be put is 2, also size will be incremented to size=size+1
    }

    //resizing
    private void resize() {
        Object[] temp = new Object[data.length * 2];
        //copy the current items in the new array
        for(int i=0; i<data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull(){
        return size == data.length;
    }



//When retrieving an element from the array, we need to cast it back to type T.
//This is required because the element is stored as an Object in the array, and we need to explicitly convert it to T.
    public T remove() {
        T removed = (T)data[--size]; //here also, if size = 5, last index = 4; therefore it will store the last element in removed and reduce size by 1
        return removed;
    }


    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index]=value;
        }


    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    // problem with this arrayList is that it does not have that data type feature <> like original array lists





    public static void main(String[] args) {
//        ArrayList list = new ArrayList<>();
//        list.add(2);
//        list.add(5);
//        list.add(9);

//        System.out.println(list);

        CustomGenArrayList<Integer> list3 = new CustomGenArrayList<>();
        list3.add(98);


    }

}
