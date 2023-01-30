public class Main {
    public static void main(String[] args) {
        GameController game = new GameController();
        game.setPlayer1(new Player('X'));
        game.setPlayer2(new Player('O'));
        game.setArea(new GameArea());
        game.setView(new ConsoleView());
        game.start();
    }
}
