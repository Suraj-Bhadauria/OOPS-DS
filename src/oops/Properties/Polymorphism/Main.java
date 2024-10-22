package oops.Properties.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square();

        //if the ref type is parent clas, object type is child class

        //Parent obj = new Child();
        // here which method will be called depends upon Child() -> this is known as upcasting
        // This whole thing is known as Overriding.

        //DYNAMIC METHOD DISPATCH


        shape.area();
    }
}
