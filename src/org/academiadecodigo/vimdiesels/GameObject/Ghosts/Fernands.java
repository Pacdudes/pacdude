package org.academiadecodigo.vimdiesels.GameObject.Ghosts;

import org.academiadecodigo.vimdiesels.GameObject.Ghost;
import org.academiadecodigo.vimdiesels.GameObject.GhostType;
import org.academiadecodigo.vimdiesels.gfx.SimpleGFX.SimpleGfxGridPosition;
import org.academiadecodigo.vimdiesels.grid.Grid;
import org.academiadecodigo.vimdiesels.grid.position.GridPosition;

public class Fernands extends Ghost {

    private GridPosition pos;
    private GhostType ghostType;

    public Fernands(SimpleGfxGridPosition pos,GhostType ghostType) {
        super(pos,ghostType);
    }
}
