package oops.statics;

public class Main {


        public static void main(String[] args) {
            Human suraj = new Human(21, "Suraj", 10000, false);
            Human ritesh = new Human(22, "Ritesh", 20000, false);

            // System.out.println(Human.population);


        }

        static void fun(){
            // you can declare non-static methods inside a static
            // greeting(); you can't use this bcoz this requires an instance


            //you cannot access non static stuff without referencing their instances in a static context
            //hence, here I am referencing it
            Main obj = new Main();
            obj.greeting();
        }

        void greeting(){
            System.out.println("Hello world");
        }

    }


