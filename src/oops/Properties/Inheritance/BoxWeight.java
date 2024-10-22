package oops.Properties.Inheritance;

import javax.sound.sampled.BooleanControl;

public class BoxWeight extends Box{
    double weight;

    static void greeting(){
        System.out.println("Hey i am in BoxWeight class. Greetings !");
    }

    public BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }




    public BoxWeight(double l, double w, double h, double weight) {
        // this should be initialised first bocz child class cares what parent class contains
        super(l, w, h); //call the parent class constructor
        // used to initialise values present in the parent class
        this.weight = weight;

        // The above classes will have no knowledge of below classes
        // we can also use super in place of this
        // need - if same var with same name exists in both parent and child class
        //System.out.println(super.weight);



    }
}
