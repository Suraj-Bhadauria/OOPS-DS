package oops.abstractDemo;
// if atleast one method is abstract, then the class needs to be abstract
// abstract functions are those which doesnot have any body
//every child class has to override the parent class
// you cannot create objects of an abstract class; you have to override the functions as well
// ,but you can use them as ref variable while declaring objects of child classes
// Parent daughter = new Daughter(28;)
//you cannot create Abstract Constructors, bcoz constructors are something that we need to initialise before, but this contradicts the theory of overrriding
//similarly you cannot create abstract static methods, bcoz they are not meant to be static
//,but we can declare/init static methods in the parent class
// we can't have final abstract class

//A class can implement more than one interface, but a class can inherit one class only
public abstract class Parent {
    int age;

    // if we are init some final variable then we have to put them inside constructor also for usses in future classes
    final int VALUE;

    public Parent(int age){
        this.age = age;
        VALUE = 32564845;
    }

    static void hello(){
        System.out.println("Hello");
    }


//    abstract classes can have normal functions like these also
    void normal(){
        System.out.println("This is a normal method");
    }



    abstract void career();
    abstract void partner();



}
