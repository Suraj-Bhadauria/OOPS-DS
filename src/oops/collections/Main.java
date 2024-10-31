package oops.collections;

import java.util.List;
import java.util.Vector;

// Vector and Arraylist are almost same, the only difference is in their internal working.
// Arraylist can be accessed by multiple threads, while vector can only be accessed by one thread at a time.

public class Main {
    public static void main(String[] args) {
        List<Integer> vector = new Vector<>();
        vector.add(45);
        vector.add(4);
        vector.add(0);
        vector.add(5);
    }

    //Enums (enumerations)
}
