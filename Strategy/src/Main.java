public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        game.setStrategy(new CenterStrategy());
        game.executeStrategy();

        game.setStrategy(new CornerStrategy());
        game.executeStrategy();
    }
}