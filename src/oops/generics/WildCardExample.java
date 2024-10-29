package oops.generics;

import java.util.Arrays;
import java.util.List;


// here Tshould be either number or its subclasses
public class WildCardExample<T extends Number> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;        //also working as index value

    public WildCardExample() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number> list){
        //do something

        //here you can only pass number type
    }

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

        WildCardExample<Integer> list3 = new WildCardExample<>();
        list3.add(98);


    }

}
