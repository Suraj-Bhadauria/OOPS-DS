package oops.cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age, String name){
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,4,5,6,7};
    }

    
//    public Human(Human other){
//        this.age=other.age;
//        this.name=other.name;
//    }

    @Override
//    Not all objects in Java are cloneable. If the class of the object doesn’t implement the Cloneable interface, calling clone() will throw a CloneNotSupportedException.
//    public Object clone() throws CloneNotSupportedException{
//        //this is shallow copy
//        // in this primitives will be copied as it is, new objects are being created
//        // but the reference types(suchas arrays) will be pointed to the main one. only pointing to the original object, thus any change from cloned object will change the data in the original objedt
//        // thus the name shallow
//        return super.clone();
//    }

    public Object clone() throws CloneNotSupportedException {
        //this is a deep copy
        Human twin = (Human)super.clone(); //this is a shallow copy

        // make a deep copy
        twin.arr = new int[twin.arr.length];
        for(int i=0; i<twin.arr.length; i++){
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }

    }
