package oops.enumExamples;


public class Basic {
    // this enum can also implement interfaces
    enum Week implements A {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants
        // by default these are = public, static and final
        // since it is final , you can't create child enums
        //type is week


        Week() {
            System.out.println("Constructor called for " + this);
        }
        // it will produce the following output
//        Constructor called for Monday
//        Constructor called for Tuesday
//        Constructor called for Wednesday
//        Constructor called for Thursday
//        Constructor called for Friday
//        Constructor called for Saturday
//        Constructor called for Sunday
//
        // this is not public, only private or default
        // why? - we don't want to create new objects , this is not the enum concept thats why
        // internally : public static final Week Monday = new Week();

        @Override
        //but to implement an interface, we must declare its methods
        public void hello(){
            System.out.println("Hello enum, this is from a interface");
        }


    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();

        for(Week day : Week.values()){
            System.out.println(day);
        }

        System.out.println(week.ordinal());


    }
}
