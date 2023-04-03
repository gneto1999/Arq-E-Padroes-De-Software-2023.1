public class ButtonTV extends Button {
    public ButtonTV(Device device) {
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
