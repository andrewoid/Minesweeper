package schwimmer.minesweeper;

import javafx.scene.control.Button;

public class Square extends Button {

    private boolean isBomb;
    private int bombsAround;

    public boolean isBomb() {
        return isBomb;
    }

    public void setBomb(boolean bomb) {
        isBomb = bomb;
    }

    public int getBombsAround() {
        return bombsAround;
    }

    public void setBombsAround(int bombsAround) {
        this.bombsAround = bombsAround;
    }
}
