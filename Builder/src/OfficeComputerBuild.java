public class OfficeComputerBuild extends ComputerBuild {
    @Override
    public void ram() {
        computer.setRam(8);
    }

    @Override
    public void ssd() {
        computer.setSsd(512);
    }

    @Override
    public void cpu() {
        computer.setCpu("Intel i5 10th 2.9 GHz");
    }

    @Override
    public void gpu() {
        computer.setGpu("Nvidia GeForce RTX 3080");
    }
}
