package org.academiadecodigo.vimdiesels.GameObject.Ghosts;

import org.academiadecodigo.vimdiesels.GameObject.Ghost;
import org.academiadecodigo.vimdiesels.gfx.SimpleGFX.SimpleGfxGridPosition;
import org.academiadecodigo.vimdiesels.grid.Grid;
import org.academiadecodigo.vimdiesels.grid.position.GridPosition;

public class Mary extends Ghost {

    private GridPosition pos;

    public Mary(SimpleGfxGridPosition pos) {
        super(pos);
    }
}
