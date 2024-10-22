package oops.Properties.Inheritance;

//Multiple inheritance not allowed in java


public class BoxPrice extends BoxWeight{
    double cost;

    BoxPrice(){
        super();
        this.cost = -1;

    }

    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }

    BoxPrice(double cost){
        super();
    }

    BoxPrice(double l,double w,double h, double weight, double cost){
        super(l,h,w,weight);
        this.cost = cost;
    }

    BoxPrice(double side, double weight, double cost){
        super(side,weight);
        this.cost = cost;
    }


}
