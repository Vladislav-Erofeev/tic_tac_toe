public class GameController {
    Playable player1;
    Playable player2;
    GameArea area;
    Drawable view;

    public Playable getPlayer1() {
        return player1;
    }

    public void setPlayer1(Playable player1) {
        this.player1 = player1;
    }

    public Playable getPlayer2() {
        return player2;
    }

    public void setPlayer2(Playable player2) {
        this.player2 = player2;
    }

    public GameArea getArea() {
        return area;
    }

    public void setArea(GameArea area) {
        this.area = area;
    }

    public Drawable getView() {
        return view;
    }

    public void setView(Drawable view) {
        this.view = view;
    }

    public void start() {
        while(area.getCondition() == GameCondition.UNDEFINED) {
            player1.next(area, view);
            view.draw(area);
            player2.next(area, view);
            view.draw(area);
        }
        System.out.println(area.getCondition());
    }
}
