package org.academiadecodigo.vimdiesels.GameObject;

import org.academiadecodigo.vimdiesels.gfx.SimpleGFX.SimpleGfxGridPosition;
import org.academiadecodigo.vimdiesels.grid.Grid;
import org.academiadecodigo.vimdiesels.grid.position.GridPosition;

public class Ghost extends GameObject {


    private GridPosition pos;

    private boolean dead;

    public Ghost(SimpleGfxGridPosition pos) {
        this.pos = pos;
    }

}
