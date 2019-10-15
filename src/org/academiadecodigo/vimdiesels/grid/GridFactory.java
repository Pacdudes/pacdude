package org.academiadecodigo.vimdiesels.grid;

import org.academiadecodigo.vimdiesels.gfx.SimpleGFX.SimpleGfxGrid;


public class GridFactory {

    public static SimpleGfxGrid makeGrid(int cols, int rows) {
        return new SimpleGfxGrid(cols, rows);

    }

}
