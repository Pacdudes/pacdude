package org.academiadecodigo.vimdiesels.grid;

import org.academiadecodigo.vimdiesels.grid.position.GridPosition;

public interface Grid {


    void init();

    int getCols();

    int getRows();

    GridPosition makeGridPosition();

    GridPosition makeGridPosition(int col, int row);

}
