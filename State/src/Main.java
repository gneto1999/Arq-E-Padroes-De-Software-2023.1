public class Main {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.cameraButton();
        cellphone.turnOnButton();

        cellphone.setState(new OnState());
        cellphone.cameraButton();
        cellphone.turnOnButton();

        cellphone.setState(new CameraAppState());
        cellphone.cameraButton();
        cellphone.turnOnButton();

        cellphone.setState(new outsideCameraAppState());
        cellphone.cameraButton();
        cellphone.turnOnButton();
    }
}