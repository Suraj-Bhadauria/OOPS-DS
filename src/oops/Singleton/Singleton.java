package oops.Singleton;

/*
-> If you want to create a single object of a class, that means you only need one instance .
-> thus make its constructor private,
-> with this it wil only be able to run in the original class file only.
 */
public class Singleton {
    //    private  int num=0;

        private Singleton(){

        }

        private static Singleton instance;

        public static Singleton getInstance(){
            //check whether only one object is created or not
            if (instance == null) {
                instance = new Singleton();  //private constructor called
            }

            return instance;




        }





}
