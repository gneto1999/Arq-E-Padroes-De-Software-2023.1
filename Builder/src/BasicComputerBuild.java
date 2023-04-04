public class BasicComputerBuild extends ComputerBuild {
    @Override
    public void ram() {
        computer.setRam(4);
    }

    @Override
    public void ssd() {
        computer.setSsd(120);
    }

    @Override
    public void cpu() {
        computer.setCpu("Intel i5 8th 1.60 GHz");
    }

    @Override
    public void gpu() {
        computer.setGpu("Intel graphics");
    }
}
