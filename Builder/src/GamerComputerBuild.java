public class GamerComputerBuild extends ComputerBuild {
    
    @Override
    public void ram() {
        computer.setRam(32);
    }

    @Override
    public void ssd() {
        computer.setSsd(960);
    }

    @Override
    public void cpu() {
        computer.setCpu("Intel i9 11th 5.20 GHz");
    }

    @Override
    public void gpu() {
        computer.setGpu("Nvidia GeForce RTX 3080");
    }
}
