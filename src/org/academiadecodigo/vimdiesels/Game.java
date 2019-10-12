package org.academiadecodigo.vimdiesels;

import org.academiadecodigo.vimdiesels.GameObject.GameObject;
import org.academiadecodigo.vimdiesels.GameObject.PlayableCharacter;
import org.academiadecodigo.vimdiesels.PlayableCharacter.Ande;
import org.academiadecodigo.vimdiesels.gfx.SimpleGFX.SimpleGfxGrid;
import org.academiadecodigo.vimdiesels.gfx.SimpleGFX.SimpleGfxGridPosition;
import org.academiadecodigo.vimdiesels.grid.Grid;
import org.academiadecodigo.vimdiesels.grid.GridFactory;
import org.academiadecodigo.vimdiesels.grid.position.GridPosition;

import java.util.ArrayList;

public class Game {

    private SimpleGfxGrid grid;
    private ArrayList<GameObject> objectlist;

    public Game() {

        this.grid = GridFactory.makeGrid(20,20);

    }

    public void init(){
        grid.init();
        Ande ande = new Ande("andre", 100, 1, new SimpleGfxGridPosition(0,0,grid));
        ande.move();


    }
}
