/*
PACKAGES
-> packages are container for classes or boxes of classes
-> used to keep the class names in compartments (compartmentalized)
-> it is just a folder
-> com.kunal means com folder contains kunal folder
-> if there is only one folder inside a folder then it will append its name in its name, just like above example
-> to use a function of a different file of a diff package in a diff file of a diff package, you need to use "import"
-> //import static com.kunal.packages.b.Message.message;
-> if you want to use features of a different class in a diff class in a same/common folder, you don't need to use "import" and stuff
-> the above points talk about if you want to create objects of a class in a different class
-> import static com.kunal.packages.b.Message.message;

-> a variable common for all class object is called a static variable
-> this.population +=1;
-> as static variable is not a particular variable of an object,,thus we avoid using this, instead we write
-> kind of a convention
-> whenever you are modifying, declaring or printing static variable, don't do it using ref variable, do it using   class name, (it will work with both ways, but it's a good convention)
-> Static variables can be accessed without creating object, not dependent on objects, we can use them without objects creation

-> we know that something which is not static, belongs to an object
-> inside the static method, you cannot use anything that is non-static
-> but we can have static methods inside non-static methods
-> use classname.method() to call a static method
 */



package oops.statics;

public class Human {


        int age;
        String name;
        int salary;
        boolean married;
        static long population;

        public Human(int age, String name, int salary, boolean married){
            this.age = age;
            this.name = name;
            this.salary = salary;
            this.married = married;

            Human.population += 1;


    }
}
