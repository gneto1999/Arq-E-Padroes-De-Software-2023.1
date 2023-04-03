public class TV implements Device {
    private void tuneTvChannels() {
        System.out.println("Sintonizar canais de TV");
    }

    @Override
    public void on() {
        System.out.println("Ligando a TV");
        tuneTvChannels();
    }

    @Override
    public void off() {
        System.out.println("Deslisgando a TV");
    }
}
