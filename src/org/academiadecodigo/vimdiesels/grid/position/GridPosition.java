package org.academiadecodigo.vimdiesels.grid.position;

import org.academiadecodigo.vimdiesels.grid.GridColor;
import org.academiadecodigo.vimdiesels.grid.GridDirection;

public interface GridPosition {

    int getCol();

    int getRow();

    void moveTo(int col, int row);

    GridColor getColor();

    void setColor(GridColor color);

    void moveInDirection(GridDirection direction, int distance);

    boolean equals(GridPosition position);

}
