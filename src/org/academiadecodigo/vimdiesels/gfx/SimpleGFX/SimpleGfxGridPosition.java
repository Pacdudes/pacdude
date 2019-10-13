package org.academiadecodigo.vimdiesels.gfx.SimpleGFX;


import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.vimdiesels.grid.GridColor;
import org.academiadecodigo.vimdiesels.grid.GridDirection;
import org.academiadecodigo.vimdiesels.grid.position.AbstractGridPosition;
import org.academiadecodigo.vimdiesels.grid.position.GridPosition;

/**
 * Simple graphics position
 */
public class SimpleGfxGridPosition extends AbstractGridPosition {

    private Rectangle rectangle;
    private SimpleGfxGrid simpleGfxGrid;
    private Picture picture;


    /**
     * Simple graphics position constructor
     *
     * @param col  position column
     * @param row  position row
     * @param grid Simple graphics grid
     */
    public SimpleGfxGridPosition(int col, int row, SimpleGfxGrid grid, Picture picture) {

        super(col, row, grid);

        simpleGfxGrid = (SimpleGfxGrid) getGrid();

        int x = simpleGfxGrid.columnToX(col);
        int y = simpleGfxGrid.rowToY(row);
        this.picture = picture;
        this.rectangle = new Rectangle(x, y, simpleGfxGrid.getCellSize(), simpleGfxGrid.getCellSize());
        rectangle.setColor(Color.BLACK);
        show();

    }


    /**
     * @see AbstractGridPosition#setColor(GridColor)
     */
    @Override
    public void setColor(GridColor color) {
        this.rectangle.setColor(SimpleGfxColorMapper.getColor(color));
        super.setColor(color);
    }

    /**
     * @see GridPosition#show()
     */
    @Override
    public void show() {
        this.rectangle.fill();
    }

    /**
     * @see GridPosition#hide()
     */
    @Override
    public void hide() {
        this.rectangle.delete();
    }

    /**
     * @see GridPosition#moveInDirection(GridDirection, int)
     */
    @Override
    public void moveInDirection(GridDirection direction, int distance) {

        int initialCol = getCol();
        int initialRow = getRow();

        super.moveInDirection(direction, distance);

        int dx = simpleGfxGrid.columnToX(getCol()) - simpleGfxGrid.columnToX(initialCol);
        int dy = simpleGfxGrid.rowToY(getRow()) - simpleGfxGrid.rowToY(initialRow);
        this.picture.translate(dx,dy);
        this.rectangle.translate(dx, dy);

    }

    public SimpleGfxGrid getSimpleGfxGrid() {
        return simpleGfxGrid;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public Picture getPicture() {
        return picture;
    }
}
