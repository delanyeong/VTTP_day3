package day3.myapp3.core;

public class RemoteControl {
    
    private Controllable control;

    public RemoteControl(Controllable c) {
        this.control= c;

    }

    public void start() {
        this.control.start;
    }
}
    public void stop() {
        this.control.stop;
    }
