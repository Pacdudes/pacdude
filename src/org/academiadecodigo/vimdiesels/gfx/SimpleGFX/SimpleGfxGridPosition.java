package org.academiadecodigo.vimdiesels.gfx.SimpleGFX;


import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.vimdiesels.grid.Grid;
import org.academiadecodigo.vimdiesels.grid.GridColor;
import org.academiadecodigo.vimdiesels.grid.GridDirection;
import org.academiadecodigo.vimdiesels.grid.position.AbstractGridPosition;
import org.academiadecodigo.vimdiesels.grid.position.GridPosition;

public class SimpleGfxGridPosition extends AbstractGridPosition {

    private SimpleGfxGrid simpleGfxGrid;
    private Picture picture;

    public SimpleGfxGridPosition(int col, int row, SimpleGfxGrid grid, Picture picture) {

        super(col, row, grid);
        this.picture = picture;

    }
    public SimpleGfxGridPosition(int col, int row, SimpleGfxGrid grid) {

        super(col, row, grid);

        simpleGfxGrid = (SimpleGfxGrid) getGrid();

        int x = simpleGfxGrid.columnToX(col);
        int y = simpleGfxGrid.rowToY(row);

    }

    @Override
    public void moveInDirection(GridDirection direction, int distance) {

        int initialCol = getCol();
        int initialRow = getRow();

        super.moveInDirection(direction, distance);

        int dx = (getCol()-initialCol)* 35;
        int dy = (getRow()-initialRow)*35;
        this.picture.translate(dx,dy);

    }

    public SimpleGfxGrid getSimpleGfxGrid() {
        return simpleGfxGrid;
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }
}
