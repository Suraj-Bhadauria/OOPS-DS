package oops.generics;

import java.util.ArrayList;
import java.util.function.Consumer;

//Lambda functions are a way to write short, simple functions without explicitly defining them in a class or method.
//It looks like this:
//(parameters) -> { body of the function }

//without lambda
//Runnable r = new Runnable() {
//    @Override
//    public void run() {
//        System.out.println("Running");
//    }
//};

//with lambda
//Runnable r = () -> System.out.println("Running");

//A Consumer is a functional interface that takes an input but does not return anything. It is often used to perform actions like printing, logging, or updating objects.


public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<5; i++){
            arr.add(i+1);
        }
//        arr.forEach((item) -> System.out.println(item*2));

        //storing it in a Consumer type
//        Consumer<Integer> fun =  (item) -> System.out.println(item*2);
//        arr.forEach(fun);

        Operation sum = (a,b) -> a+b;
        Operation prod = (a,b) -> a*b;
        Operation subt = (a,b) -> a-b;

        LambdaFunctions myCalculator = new LambdaFunctions();
        System.out.println( myCalculator.operate(5,3, sum));
        System.out.println( myCalculator.operate(5,3, prod));
        System.out.println( myCalculator.operate(5,3, subt));






    }

    private int operate(int a, int b, Operation op){
        return op.operation(a,b);

    }


}

interface Operation{
    int operation(int a, int b);
}
