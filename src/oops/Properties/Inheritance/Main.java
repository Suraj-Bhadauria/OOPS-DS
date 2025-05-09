package oops.Properties.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
//        System.out.println(box1.l + " " + box1.w + " " + box1.h);

//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2,3,4,5);
//
//        System.out.println(box3.l + " " + box3.w+" "+box3.h+" "+box3.weight);

        Box box5 = new BoxWeight(2, 3, 4, 8);
//        System.out.println(box5.w);

        //it is not the type of object that determines what members can be accessed but the reference variable


        //there are many variables in both parent and child classes
        //you are given access to variables that are in the reference type, i.e. BoxWeight
        //hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error

//        BoxWeight box6 = new Box(2, 3, 4); //but box class does not know what is in its below class
//        System.out.println(box6.w);

//        BoxPrice box7 = new BoxPrice(5,8,200);
//        box1.greeting();

        Box box = new BoxWeight();
        box.greeting(); //static methods will run from parent clas
        // you cannot ovveride static methods
        // but static methods can be inherited for other uses.



}
}
