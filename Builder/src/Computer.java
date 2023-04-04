public class Computer {
    private int ram;
    private int ssd;
    private String cpu;
    private String gpu;

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", ssd=" + ssd +
                ", cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                '}';
    }
}
