package cinema;

public enum MenuAction {
    SHOW(1),
    BUY(2),
    EXIT(0);

    final private int select;

    MenuAction(int select) {
        this.select = select;
    }

    public int getSelect() {
        return select;
    }
}