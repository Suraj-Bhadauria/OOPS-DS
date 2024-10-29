package oops.access;


public class ObjectDemo {

    int num ;
    float gpa;

    public ObjectDemo(int num, float gpa){
        this.num = num;
        this.gpa = gpa;
    }


    // already covered these 2

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(12, 56.8f);
        ObjectDemo obj2 = new ObjectDemo(12, 78.9f);


        // this checks whether obj1 and obj2 are poinitng to the same object
        if(obj1 == obj2){
            System.out.println("Obj1 is equal to obj2");
        }
        // this checks the content of both the objects
        if(obj1.equals(obj2)){
            System.out.println("Obj1 is equal to obj2");
        }


//        System.out.println(obj.hashCode());

    }
}
