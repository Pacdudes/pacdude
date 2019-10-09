package org.academiadecodigo.vimdiesels;

import org.academiadecodigo.vimdiesels.grid.Grid;
import org.academiadecodigo.vimdiesels.grid.GridFactory;

public class Game {

    private Grid grid;
    private Grid playableGrid;

    public Game() {
        this.grid = GridFactory.makeGrid(29,25);
        this.playableGrid = GridFactory.makeGrid(25,21);
    }

    public void init(){
        grid.init();
        playableGrid.init();

    }
}
