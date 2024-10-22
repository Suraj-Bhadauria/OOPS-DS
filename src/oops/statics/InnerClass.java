package oops.statics;

//outside classes cannot be static, bcoz it is itself not dependent on any other class
//but as inner classes are dependent on outside class, hence, they can be static
/*
-> Objects are resolved during run-time and static data-types are not dependent on objects.
-> Thus static data-types are resolved during compile-time only.
 */

public class InnerClass {

    static class Test{
        String name;
        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Suraj");
        Test b = new Test("Ritesh");

        System.out.println(a.name);  // output -suraj
        System.out.println(b.name);  //output - ritesh
        //this is bcoz class Test is static for class InnerClass, but its own objects are not declared static(see)
    }

}
