package org.academiadecodigo.vimdiesels.GameObject;

import org.academiadecodigo.vimdiesels.gfx.SimpleGFX.SimpleGfxGridPosition;

public class GameObject {

    private SimpleGfxGridPosition pos;
    public boolean dead;

    public boolean isDead() {
        return dead = true;
    }

    public GameObject() {
        this.pos = pos;
    }

    public SimpleGfxGridPosition getPos() {
        return pos;
    }

}
