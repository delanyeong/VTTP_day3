package myapp3.core;

//Class
//Default constructor 
public class Car implements Controllable{

    public Car() { //this is a constructor 
        System.out.println("*** Instatiating Car object");

    }

    // properties, members 1
    String colour;
    String make;
    Integer engineCapacity;
    Boolean started = false;
    private long startedSince;

    // Methods: Get Method Set Method (Getters and Setters) hide the properties
    // within the method

    // getter and setter for colour : 1
    public void setColour(String c) {
        if (!colour.equals("red"))
            this.colour = c;
    }

    public String getColour() {
        return this.colour;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Boolean isStarted() { // for boolean set as Is, everthing else is get
        return started;
    }

    public void setStarted(Boolean started) {
        this.started = started;
    }

    // getter and setter for engineCapacity
    public void setEngineCapacity(Integer capacity) {
        this.engineCapacity = capacity;
    }

    public Integer getEngineCapacity() {
        return this.engineCapacity;
    }

    public Integer getDrivingDurantion() { // 4
        if (isStarted())
            // Convert to ms -> sec
            return (System.currentTimeMillis() - this.startedSince) / 1000;
        else
            return (long)-1;
    }

    // behaviour - methods - 2
    public void start() {
        if (this.started) {
            System.out.println("your car is running");
        } else {
            System.out.println("Vroom....");
            {
                this.started = true;

                // Since 0000 Jan 1 1970
                this.startedSince = System.currentTimeMillis();
            }
        }
    }

    public void stop() {
        if (!this.started) {
            System.out.println("your car is not running");
        } else {
            System.out.println("Splutter...");
            {
                this.started = false;
            }
        }
    }

}
