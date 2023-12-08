package behavioral.mediator.fan_simulation;

public class Fan {

    private boolean on;
    private Mediator mediator;


    public void turnOn() {
        mediator.startSupplier();
        on = true;
    }

    public void turnOff() {
        mediator.stopSupplier();
        on = false;
    }

    public boolean isOn() {
        return on;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
