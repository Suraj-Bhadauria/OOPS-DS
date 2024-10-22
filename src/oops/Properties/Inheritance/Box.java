package oops.Properties.Inheritance;

public class Box {
    double l;
    double w;
    double h;
    double weight;

    Box(){
        this.h=-1;
        this.w=-1;
        this.l=-1;
    }


    //cube
    Box(double side){
        // super(); object class
        this.h=side;
        this.w=side;
        this.l=side;
    }

    //cuboid
    Box(double l, double w, double h){
        super();
        // it refers to the class directly above it
        System.out.println("Box class constructor");
        this.h=h;
        this.w=w;
        this.l=l;
    }

    //copy constructor
    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }


    public void information(){
        System.out.println("Running the box ");

    }

}
