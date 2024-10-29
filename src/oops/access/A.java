package oops.access;

public class A {
    private int num;
    String name;
    int[] arr;

    // to access this private int we can use methods such as getter and setter


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


    //constructor
    public A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    // In- built packages
    /*
    1. lang
    2. io
    3. util (data sturctures)
    4. applet (job)
    5. awt (gui etc) (job)
    6. net (for networking purposes
     */

    //Object class
    /*
   -> every class inherits from object class
   -> this is the root class for inheritance
     */
}

