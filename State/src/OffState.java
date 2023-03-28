public class OffState implements CellphoneState {
    @Override
    public void turnOnButton() {
        System.out.println("Liga a tela do celular");
    }

    @Override
    public void cameraButton() {
        System.out.println("Não faz nada");
    }
}
