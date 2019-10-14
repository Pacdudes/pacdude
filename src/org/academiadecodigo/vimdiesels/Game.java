package org.academiadecodigo.vimdiesels;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
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
    private Mary mary;
    private TioFaustino tioFaustino;
    private Bigotes bigotes;
    private Fernands fernands;
    private int cols = 21;
    private int rows = 25;
    private int cellSize = 35;
    private int height = rows * cellSize;
    private int width = cols * cellSize;
    private SimpleGfxGrid grid;
    public static final String resourcesImages = "./gameResources/images";
    private ArrayList<Picture> pictureArrayList;
    private ArrayList<Ghost> ghostArrayList;
    private ColisionDetector colisionDetector;

    public Game() {

        this.grid = new SimpleGfxGrid(cols, rows);
        this.objectlist = new ArrayList<>();
        this.ghostArrayList = new ArrayList<>();
        colisionDetector = new ColisionDetector(objectlist);
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
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 7, 7, 7, 7, 7, 7, 7, 0, 1, 0, 7, 7, 7, 7, 7, 7, 7, 0, 1},
                {1, 0, 7, 7, 8, 8, 8, 7, 7, 0, 1, 0, 7, 7, 7, 7, 7, 7, 7, 0, 1},
                {1, 0, 7, 7, 8, 8, 8, 7, 7, 0, 1, 0, 7, 7, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 7, 7, 7, 7, 7, 7, 7, 0, 1, 0, 7, 7, 0, 1, 1, 1, 1, 1, 1},
                {1, 0, 7, 7, 0, 0, 0, 7, 7, 0, 1, 0, 7, 7, 0, 1, 1, 1, 1, 1, 1},
                {1, 0, 7, 7, 0, 1, 0, 7, 7, 0, 1, 0, 7, 7, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 7, 7, 0, 1, 0, 7, 7, 0, 1, 0, 7, 7, 7, 7, 7, 7, 7, 0, 1},
                {1, 0, 7, 7, 0, 1, 0, 7, 7, 0, 1, 0, 7, 7, 7, 7, 7, 7, 7, 0, 1},
                {1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1},
                {1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 1, 0, 1, 3, 4, 1, 5, 6, 1, 0, 1, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1},
                {1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1},
                {1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1},
                {1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 2, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        };
        for (int x = 0; x < cols; x++) {
            for (int y = 0; y < rows; y++) {

                int gameObject = supermap[y][x];

                if (gameObject == 0) {
                    Coin coin = new Coin(new SimpleGfxGridPosition(x, y, grid, new Picture(x * cellSize + 10, y
                            * cellSize + 10, "gameResources/images/objects/Java Cup.png")));
                    coin.getPos().getRectangle().setColor(Color.BLACK);
                    coin.getPos().getPicture().draw();
                    objectlist.add(coin);
                    continue;
                }
                if (gameObject == 1) {
                    Wall wall = new Wall(new SimpleGfxGridPosition(x, y, grid, new Picture(x * cellSize + 10, y
                            * cellSize + 10, "gameResources/images/objects/Wall.png")));
                    wall.getPos().getRectangle().setColor(Color.PINK);
                    wall.getPos().getPicture().draw();

                    objectlist.add(wall);
                    continue;
                }
                if (gameObject == 2) {
                    Rectangle recktangle = new Rectangle(x*cellSize+10,y*cellSize + 10,cellSize,cellSize);
                    recktangle.fill();
                    pictureArrayList = new ArrayList<>();
                    pictureArrayList.add(new Picture(x * cellSize + 10,
                            y * cellSize + 10, "gameResources/images/playableCharacters/andeghostsize.png"));
                    pictureArrayList.add(new Picture(x * cellSize + 10,
                            y * cellSize + 10, "gameResources/images/playableCharacters/danonesghostsize.png"));
                    pictureArrayList.add(new Picture(x * cellSize + 10,
                            y * cellSize + 10, "gameResources/images/playableCharacters/titighostsize.png"));
                    pictureArrayList.add(new Picture(x * cellSize + 10,
                            y * cellSize + 10, "gameResources/images/playableCharacters/vitinhoghostsize.png"));
                    pc = new PlayableCharacter(
                            new SimpleGfxGridPosition(
                                    x,
                                    y,
                                    grid,
                                    pictureArrayList.get((int) (Math.random()* pictureArrayList.size()))));

                    pc
                            .getPos()
                            .getPicture()
                            .draw();

                    continue;
                }

                if (gameObject == 3) {

                    Picture picture = new Picture(x * cellSize + 10, y * cellSize + 10, "gameResources/images/ghosts/faustinoghostsize.png");
                    Rectangle recktangle = new Rectangle(x*cellSize+10,y*cellSize + 10,cellSize,cellSize);
                    recktangle.fill();
                    SimpleGfxGridPosition gp = new SimpleGfxGridPosition(x, y, grid, picture);

                    tioFaustino = new TioFaustino(gp,GhostType.TIO_FAUSTINO);

                    objectlist.add(tioFaustino);
                    ghostArrayList.add(tioFaustino);
                    tioFaustino.getPos().getPicture().draw();

                    continue;
                }

                if (gameObject == 4) {
                    Rectangle recktangle = new Rectangle(x*cellSize+10,y*cellSize + 10,cellSize,cellSize);
                    recktangle.fill();
                    mary = new Mary(new SimpleGfxGridPosition(x, y, grid, new Picture(x * cellSize + 10, y
                            * cellSize + 10, "gameResources/images/ghosts/marighostsize.png")),GhostType.MARY);
                    objectlist.add(mary);
                    ghostArrayList.add(mary);
                    mary.getPos().getPicture().draw();
                    continue;
                }
                if (gameObject == 5) {
                    Rectangle recktangle = new Rectangle(x*cellSize+10,y*cellSize + 10,cellSize,cellSize);
                    recktangle.fill();
                    fernands = new Fernands(new SimpleGfxGridPosition(x, y, grid, new Picture(x * cellSize + 10, y
                            * cellSize + 10, "gameResources/images/ghosts/fernadzghostsize.png")),GhostType.FERNANDS);
                    objectlist.add(fernands);
                    ghostArrayList.add(fernands);
                    fernands.getPos().getPicture().draw();
                    continue;
                }
                if (gameObject == 6) {
                    Rectangle recktangle = new Rectangle(x*cellSize+10,y*cellSize + 10,cellSize,cellSize);
                    recktangle.fill();
                    bigotes = new Bigotes(new SimpleGfxGridPosition(x, y, grid, new Picture(x * cellSize + 10, y
                            * cellSize + 10, "gameResources/images/ghosts/bigotteghostsize.png")),GhostType.BIGOTES);
                    objectlist.add(bigotes);
                    ghostArrayList.add(bigotes);
                    bigotes.getPos().getPicture().draw();
                    continue;
                }

                if (gameObject == 7) {
                    Wall wall = new Wall(new SimpleGfxGridPosition(x, y, grid, new Picture(x * cellSize + 10, y
                            * cellSize + 10, "gameResources/images/objects/RedWall.png")));
                    wall.getPos().getPicture().draw();
                    objectlist.add(wall);

                }
                if(gameObject ==8){
                    new SimpleGfxGridPosition(x,y,grid);

                }
            }
        }
    }


    public void init() {
        gridMaker(grid);
        colisionDetector = new ColisionDetector(objectlist);
        pc.setColisionDetector(colisionDetector);
        for (Ghost ghost: ghostArrayList
             ) {
            ghost.setColisionDetector(colisionDetector);
        }
        try {
            start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public ArrayList<GameObject> getObjectlist() {
        return objectlist;
    }

    public ArrayList<Ghost> getGhostArrayList() {
        return ghostArrayList;
    }

    public void moveAllGhost(){
        for (Ghost ghost: ghostArrayList
        ) {
            ghost.move();
        }
        }

    void start() throws InterruptedException {

        while (true) {

            // Pause for a while
            Thread.sleep(300);

            moveAllGhost();

        }

    }

}

