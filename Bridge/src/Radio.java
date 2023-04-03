public class Radio implements Device {
    private void tuneRadioChannels() {
        System.out.println("Sintonizar canais de Radio");
    }

    @Override
    public void on() {
        System.out.println("Ligando o Rádio");
        tuneRadioChannels();
    }

    @Override
    public void off() {
        System.out.println("Ligando o Rádio");
    }
}
