public class ButtonRadio extends Button {
    public ButtonRadio(Device device) {
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
