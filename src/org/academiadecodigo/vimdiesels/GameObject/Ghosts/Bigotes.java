package org.academiadecodigo.vimdiesels.GameObject.Ghosts;

import org.academiadecodigo.vimdiesels.GameObject.Ghost;
import org.academiadecodigo.vimdiesels.GameObject.GhostType;
import org.academiadecodigo.vimdiesels.gfx.SimpleGFX.SimpleGfxGridPosition;
import org.academiadecodigo.vimdiesels.grid.GridDirection;

public class Bigotes extends Ghost {

    private GridDirection pos;
    private GhostType ghostType;

    public Bigotes(SimpleGfxGridPosition pos, GhostType ghostType) {
        super(pos, ghostType);

    }
}
