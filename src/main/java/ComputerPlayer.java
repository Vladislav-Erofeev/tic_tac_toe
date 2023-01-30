public class ComputerPlayer implements Playable{
    private GameMode mode = GameMode.EASY;
    private char symbol;

    public ComputerPlayer(char symbol) {
        this.symbol = symbol;
    }

    public void setMode(GameMode mode) {
        this.mode = mode;
    }

    public void easyMode(GameArea area) {
        while(true) {
            try {
                area.set((int)Math.round(Math.random() * 9), symbol);
                break;
            } catch (Exception e) { }
        }
    }
    @Override
    public void next(GameArea area, Drawable view) {
        if(mode == GameMode.EASY) {
            easyMode(area);
        }
    }
}
