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

    /**
     * Simple graphics grid constructor with a certain number of rows and columns
     *
     * @param cols number of the columns
     * @param rows number of rows
     */
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


    /**
     * Initializes the field simple graphics rectangle and draws it
     */
    @Override
    public void init() {
        this.field = new Rectangle(PADDING, PADDING, cols * cellSize, rows * cellSize);
        this.field.setColor(Color.BLACK);
        this.field.draw();
    }

    /**
     * @see Grid#makeGridPosition(int, int)
     */

    @Override
    public GridPosition makeGridPosition(int col, int row) {
        return new SimpleGfxGridPosition(col, row, this,
                new Picture(col,row,"resources/RedWall.png"));
    }

    /**
     * Auxiliary method to compute the y value that corresponds to a specific row
     *
     * @param row index
     * @return y pixel value
     */
    int rowToY(int row) {
        return PADDING + cellSize * row;
    }

    /**
     * Auxiliary method to compute the x value that corresponds to a specific column
     *
     * @param column index
     * @return x pixel value
     */
    int columnToX(int column) {
        return PADDING + cellSize * column;
    }

}
