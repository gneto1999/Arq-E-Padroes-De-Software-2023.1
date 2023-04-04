public class Director {
    private ComputerBuild build;

    public Director(ComputerBuild build) {
        this.build = build;
    }

    public void setBuild(ComputerBuild build) {
        this.build = build;
    }

    public void assembleComputer() {
        build.cpu();
        build.gpu();
        build.ram();
        build.ssd();
    }

    public Computer getComputer() {
        return build.getComputer();
    }
}