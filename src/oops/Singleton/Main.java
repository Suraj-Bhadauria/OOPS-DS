package oops.Singleton;

public class Main {
//    Singleton obj = new Singleton(); //-> error : constructor is private
//    obj.num -> error bcoz this num is private

    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
        // these all will give the one instance that will be created internally
        // all 3 ref variables are pointing to just one subject
    }

}
