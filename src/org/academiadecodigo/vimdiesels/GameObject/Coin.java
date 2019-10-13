package org.academiadecodigo.vimdiesels.GameObject;

import org.academiadecodigo.vimdiesels.gfx.SimpleGFX.SimpleGfxGridPosition;
import org.academiadecodigo.vimdiesels.grid.position.GridPosition;

public class Coin extends GameObject {

    private Coin coin;
    private SimpleGfxGridPosition pos;

    public Coin(SimpleGfxGridPosition pos) {
        this.pos = pos;
    }

    @Override
    public SimpleGfxGridPosition getPos() {
        return pos;
    }
}
