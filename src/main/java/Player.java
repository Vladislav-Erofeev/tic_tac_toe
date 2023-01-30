public class Player implements Playable{
    private char symbol;

    public Player(char symbol) {
        this.symbol = symbol;
    }

    public void next(GameArea area, Drawable view) {
        int index;
        while(true){
            try {
                index = view.getNext();
                area.set(index, symbol);
                break;
            } catch (Exception e) {}
        }
    }
}
