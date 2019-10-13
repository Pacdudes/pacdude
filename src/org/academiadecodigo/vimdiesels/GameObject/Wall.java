package org.academiadecodigo.vimdiesels.GameObject;

import org.academiadecodigo.vimdiesels.Interfaces.Hitable;
import org.academiadecodigo.vimdiesels.gfx.SimpleGFX.SimpleGfxGrid;
import org.academiadecodigo.vimdiesels.gfx.SimpleGFX.SimpleGfxGridPosition;
import org.academiadecodigo.vimdiesels.grid.position.GridPosition;

public class Wall extends GameObject implements Hitable {

    private Wall wall;
    private SimpleGfxGridPosition pos;

    public Wall(SimpleGfxGridPosition pos) {
        this.pos = pos;
    }

    @Override
    public boolean isHit() {
        return false;
    }

    public SimpleGfxGridPosition getPos() {
        return pos;
    }
}
