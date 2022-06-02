package myapp3.core;

public class Main {
    public static void main(String[] args) {
        // Instantiate a car
        Car myCar = new Car();
        myCar.setColour("red");
        // myCar.colour = "red";
        // myCar.make = "toyota";
        // myCar.engineCapacity = 2000;

        myCar.start();
        System.out.printf(" I have changed colour of my car to %s\n", myCar.getColour());

        myCar.setColour("blue");
        System.out.printf(" I have changed colour of my car to %s\n", myCar.getColour());

        // Instantiate another Car
        Car myCar2 = new Car();
        myCar2.colour = "blue";
        myCar2.make = "honda";
        myCar2.engineCapacity = 2500;

        myCar2.stop();

        Car myThirdCar = new Car ("silver", "subaru");

        //Honda
        


    }
}
