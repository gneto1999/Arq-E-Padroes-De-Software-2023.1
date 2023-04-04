public class Main {
    public static void main(String[] args) {
        Director director = new Director(new BasicComputerBuild());
        director.assembleComputer();
        System.out.println(director.getComputer());

        director = new Director(new OfficeComputerBuild());
        director.assembleComputer();
        System.out.println(director.getComputer());

        director = new Director(new GamerComputerBuild());
        director.assembleComputer();
        System.out.println(director.getComputer());
    }
}