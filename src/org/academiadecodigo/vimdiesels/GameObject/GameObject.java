package org.academiadecodigo.vimdiesels.GameObject;

import org.academiadecodigo.vimdiesels.grid.position.GridPosition;

public class GameObject {

    private GridPosition pos;
    public boolean dead;

    public boolean isDead() {
        return dead = true;
    }

    public GameObject() {
        this.pos = pos;
    }

    public GridPosition getPos() {
        return pos;
    }

}
