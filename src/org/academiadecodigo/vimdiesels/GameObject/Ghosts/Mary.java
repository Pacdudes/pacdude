package org.academiadecodigo.vimdiesels.GameObject.Ghosts;

import org.academiadecodigo.vimdiesels.GameObject.Ghost;
import org.academiadecodigo.vimdiesels.grid.Grid;
import org.academiadecodigo.vimdiesels.grid.position.GridPosition;

public class Mary extends Ghost {

    private String name;
    private int speed;
    private GridPosition pos;
    private Grid grid;

    public Mary(String name, int speed, GridPosition pos) {
        super(name, speed, pos);
    }
}