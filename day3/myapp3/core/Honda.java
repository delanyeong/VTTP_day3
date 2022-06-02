package day3.myapp3.core;

public class Honda extends Car {

    public Honda() {
        this.setMake("honda");

    }

    public void accelerate() {
        System.out.println("Accelerating");
    }

    @Override
    public void stop(Integer count) {
        System.out.printf("Stopping in %d seconds\n");
    }

}
