package oops.interfaces;

public class Main {
    public static void main(String[] args) {
//        Engine mycar = new Car();
//
//        mycar.accelerate();
//        mycar.start();
//        mycar.stop();
//
//        Media carMedia = new Car();
//        carMedia.stop();

       NiceCar car = new NiceCar();

       car.start();
       car.startMusic();
       car.upgradeEngine();
       car.start();


    }
}
