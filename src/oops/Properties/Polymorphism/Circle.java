package oops.Properties.Polymorphism;

public class Circle extends Shapes {

    //this will run obj of circle is created
    // hence it is overriding the parent method
    @Override   //this is called annotation
    void area(){
        System.out.println("Area is pi * radius * radius");
    }
}