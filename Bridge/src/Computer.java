public class Computer implements Device {
    private void bootSO() {
        System.out.println("Iniciando SO");
    }

    @Override
    public void on() {
        System.out.println("Ligando o computador");
        bootSO();
    }

    @Override
    public void off() {
        System.out.println("Desligando o computador");
    }
}
