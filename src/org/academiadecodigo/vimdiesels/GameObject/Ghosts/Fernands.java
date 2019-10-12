package org.academiadecodigo.vimdiesels.GameObject.Ghosts;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.vimdiesels.GameObject.Ghost;
import org.academiadecodigo.vimdiesels.GameObject.GhostType;
import org.academiadecodigo.vimdiesels.gfx.SimpleGFX.SimpleGfxGridPosition;
import org.academiadecodigo.vimdiesels.grid.Grid;
import org.academiadecodigo.vimdiesels.grid.position.GridPosition;

public class Fernands extends Ghost {

    private SimpleGfxGridPosition pos;
    private Picture picture;


    public Fernands(SimpleGfxGridPosition pos) {
        super(pos);
        this.picture = new Picture(pos.getRectangle().getX(),pos.getRectangle().getY(), "resources/teste1.png");
        picture.draw();
    }
}
