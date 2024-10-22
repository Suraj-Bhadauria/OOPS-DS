package oops.Properties.Polymorphism;

public class Numbers {
    int sum(int a, int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(1,2);
        obj.sum(1,2,3);
    }

}
