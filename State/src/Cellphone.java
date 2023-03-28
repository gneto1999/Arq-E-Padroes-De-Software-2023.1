public class Cellphone {
    private CellphoneState state = new OffState();

    public void setState(CellphoneState state) {
        this.state = state;
    }

    public void turnOnButton() {
        state.turnOnButton();
    }

    public void cameraButton() {
        state.cameraButton();
    }
}
