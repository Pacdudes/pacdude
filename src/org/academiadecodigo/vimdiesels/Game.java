package org.academiadecodigo.vimdiesels;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.vimdiesels.GameObject.*;
import org.academiadecodigo.vimdiesels.GameObject.Ghosts.Bigotes;
import org.academiadecodigo.vimdiesels.GameObject.Ghosts.Fernands;
import org.academiadecodigo.vimdiesels.GameObject.Ghosts.Mary;
import org.academiadecodigo.vimdiesels.GameObject.Ghosts.TioFaustino;

import org.academiadecodigo.vimdiesels.gfx.SimpleGFX.SimpleGfxGrid;
import org.academiadecodigo.vimdiesels.gfx.SimpleGFX.SimpleGfxGridPosition;
import org.academiadecodigo.vimdiesels.grid.Grid;
import org.academiadecodigo.vimdiesels.grid.GridFactory;
import org.academiadecodigo.vimdiesels.grid.GridType;
import org.academiadecodigo.vimdiesels.grid.position.GridPosition;

import java.util.ArrayList;

public class Game {

    private ArrayList<GameObject> objectlist;
    private GridType gridType = GridType.SIMPLE_GFX;
    private PlayableCharacter pc;
    private int cols = 21;
    private int rows = 25;
    private int cellSize = 20;
    private int height = rows * cellSize;
    private int width = cols * cellSize;
    private SimpleGfxGrid grid;

    public Game() {

        this.grid = new SimpleGfxGrid(cols, rows);
        this.objectlist = new ArrayList<GameObject>();
        //Picture background = new Picture(0,0,backgroundImage);
        //background.draw();

    }

    public void gridMaker(SimpleGfxGrid grid) {

        int[][] supermap = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1},
                {1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1},
                {1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1},
                {1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1},
                {1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1},
                {1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1},
                {1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1},
                {1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1},
                {1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 1, 0, 1, 3, 4, 1, 5, 6, 1, 0, 1, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1},
                {1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1},
                {1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1},
                {1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        };
        for (int x = 0; x < cols; x++) {
            for (int y = 0; y < rows; y++) {

                int gameObject = supermap[y][x];

                if (gameObject == 0) {
                    Coin coin = new Coin(new SimpleGfxGridPosition(x, y, grid));
                    coin.getPos().getRectangle().setColor(Color.GRAY);
                    objectlist.add(coin);
                    continue;
                }
                if (gameObject == 1) {
                    Wall wall = new Wall(new SimpleGfxGridPosition(x, y, grid));
                    wall.getPos().getRectangle().setColor(Color.PINK);
                    objectlist.add(wall);
                    continue;
                }
                if (gameObject == 2) {
                    pc = new PlayableCharacter(new SimpleGfxGridPosition(x, y, grid));
                    objectlist.add(pc);
                    continue;
                }
                if (gameObject == 3) {
                    Ghost ghost = new TioFaustino(new SimpleGfxGridPosition(x, y, grid));
                    objectlist.add(ghost);
                    continue;
                }
                if (gameObject == 4) {
                    Ghost ghost = new Mary(new SimpleGfxGridPosition(x, y, grid));
                    objectlist.add(ghost);
                    continue;
                }
                if (gameObject == 5) {
                    Ghost ghost = new Fernands(new SimpleGfxGridPosition(x, y, grid));
                    objectlist.add(ghost);
                    continue;
                }
                if (gameObject == 6) {
                    Ghost ghost = new Bigotes(new SimpleGfxGridPosition(x, y, grid));
                    objectlist.add(ghost);
                    continue;
                }
            }
        }
    }

    public void init() {
        gridMaker(grid);
        pc.move();


    }
}
