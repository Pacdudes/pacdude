package org.academiadecodigo.vimdiesels;

import org.academiadecodigo.vimdiesels.grid.Grid;
import org.academiadecodigo.vimdiesels.grid.GridFactory;
import org.academiadecodigo.vimdiesels.grid.PlayableStage;

public class Game {

    private Grid grid;
    private PlayableStage playableStage;

    public Game() {
        this.grid = GridFactory.makeGrid(29,25);
        this.playableStage = new PlayableStage();
    }

    public void init(){
        grid.init();
        playableStage.init();

    }
}
