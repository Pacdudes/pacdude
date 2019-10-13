package org.academiadecodigo.vimdiesels.grid;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.vimdiesels.grid.position.GridPosition;

public class PlayableStage implements Grid {

    private Rectangle rectangle;
    private int cols;
    private int rows;

    @Override
    public void init() {
        this.rectangle = new Rectangle();

    }

    @Override
    public int getCols() {
        return cols;
    }

    @Override
    public int getRows() {
        return rows;
    }

    @Override
    public GridPosition makeGridPosition() {
        return null;
    }

    @Override
    public GridPosition makeGridPosition(int col, int row) {
        return null;
    }
}
