public class CameraAppState implements CellphoneState {
    @Override
    public void turnOnButton() {
        System.out.println("Apaga a tela do celular");
    }

    @Override
    public void cameraButton() {
        System.out.println("Tira foto");
    }
}
