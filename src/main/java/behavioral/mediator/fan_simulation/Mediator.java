package behavioral.mediator.fan_simulation;

public class Mediator {

    private Button button;
    private Fan fan;
    private PowerSupplier powerSupplier;

    public boolean isFanOn() {
        return fan.isOn();
    }

    public void turnFanOff() {
        fan.turnOff();
    }

    public void turnFanOn() {
        fan.turnOn();
    }

    public void startSupplier() {
        powerSupplier.start();
    }

    public void stopSupplier() {
        powerSupplier.stop();
    }

    public void setButton(Button button) {
        this.button = button;
        button.setMediator(this);
    }

    public void setFan(Fan fan) {
        this.fan = fan;
        fan.setMediator(this);
    }

    public void setPowerSupplier(PowerSupplier powerSupplier) {
        this.powerSupplier = powerSupplier;
    }
}
