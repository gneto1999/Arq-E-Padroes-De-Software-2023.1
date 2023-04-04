public abstract class ComputerBuild {
    protected Computer computer;

    public ComputerBuild() {
        computer = new Computer();
    }

    public abstract void ram();
    public abstract void ssd();
    public abstract void cpu();
    public abstract void gpu();

    public Computer getComputer() {
        return computer;
    }

    public void resetComputer() {
        computer = new Computer();
    }
}
