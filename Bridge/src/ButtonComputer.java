public class ButtonComputer extends Button {
    public ButtonComputer(Device device) {
        super(device);
    }

    @Override
    public void on() {
        device.on();
    }

    @Override
    public void off() {
        device.off();
    }
}
