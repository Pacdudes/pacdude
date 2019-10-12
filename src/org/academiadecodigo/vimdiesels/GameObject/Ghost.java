package org.academiadecodigo.vimdiesels.GameObject;

import org.academiadecodigo.vimdiesels.grid.Grid;
import org.academiadecodigo.vimdiesels.grid.position.GridPosition;

public class Ghost extends GameObject {

    private String name;
    private int speed;
    private GridPosition pos;
    private Grid grid;
    private boolean dead;

    public Ghost(String name, int speed, GridPosition pos) {
        this.name = name;
        this.speed = speed;
        this.pos = pos;
    }

    public void move() {

    }


}

