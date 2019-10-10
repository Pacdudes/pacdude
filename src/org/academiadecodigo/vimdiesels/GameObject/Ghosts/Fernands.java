package org.academiadecodigo.vimdiesels.GameObject.Ghosts;

import org.academiadecodigo.vimdiesels.GameObject.Ghost;
import org.academiadecodigo.vimdiesels.GameObject.GhostType;
import org.academiadecodigo.vimdiesels.grid.Grid;
import org.academiadecodigo.vimdiesels.grid.position.GridPosition;

public class Fernands extends Ghost {

    private String name;
    private int speed;
    private GridPosition pos;
    private Grid grid;


    public Fernands(String name, int speed, GridPosition pos) {
        super(name, speed, pos);

    }
}
