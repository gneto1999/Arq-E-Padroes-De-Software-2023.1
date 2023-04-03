public abstract class Button {
    Device device;

    public Button(Device device) {
        this.device = device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public abstract void on();
    public abstract void off();
}
