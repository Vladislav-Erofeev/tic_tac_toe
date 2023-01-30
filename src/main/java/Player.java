public class Player implements Playable{
    private char symbol;

    public Player(char symbol) {
        this.symbol = symbol;
    }

    public void next(GameArea area, Drawable view) {
        int index = view.getNext();
        area.set(index, symbol);
    }
}
