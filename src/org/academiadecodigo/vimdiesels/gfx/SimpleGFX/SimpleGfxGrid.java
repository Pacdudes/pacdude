package org.academiadecodigo.vimdiesels.gfx.SimpleGFX;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.vimdiesels.grid.Grid;
import org.academiadecodigo.vimdiesels.grid.position.GridPosition;


public class SimpleGfxGrid implements Grid {

    private static final int PADDING = 10;

    private int cellSize = 35;
    private int cols;
    private int rows;
    private Rectangle field;

    public SimpleGfxGrid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        init();
    }

    public int getCellSize() {
        return this.cellSize;
    }

    @Override
    public int getCols() {
        return this.cols;
    }

    @Override
    public int getRows() {
        return this.rows;
    }

    @Override
    public GridPosition makeGridPosition() {
        return null;
    }

    public int getWidth() {
        return this.field.getWidth();
    }

    public int getHeight() {
        return this.field.getHeight();
    }

    public int getX() {
        return this.field.getX();
    }

    public int getY() {
        return this.field.getY();
    }

    @Override
    public void init() {
        this.field = new Rectangle(PADDING, PADDING, cols * cellSize, rows * cellSize);
        this.field.setColor(Color.BLACK);
        this.field.draw();
    }

    @Override
    public GridPosition makeGridPosition(int col, int row) {
        return new SimpleGfxGridPosition(col, row, this,
                new Picture(col,row,"resources/RedWall.png"));
    }

    int rowToY(int row) {
        return PADDING + cellSize * row;
    }

    int columnToX(int column) {
        return PADDING + cellSize * column;
    }

}
