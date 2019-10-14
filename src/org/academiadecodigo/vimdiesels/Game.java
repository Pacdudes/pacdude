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
import org.academiadecodigo.vimdiesels.gfx.Win;
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

        int maryx = 0;
        int maryy = 0;
        int fernadsx = 0;
        int fernadsy = 0;
        int bigotesx = 0;
        int bigotesy = 0;
        int faustinox = 0;
        int faustinoy = 0;
        int playerx = 0;
        int playery = 0;
        int[][] supermap = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 3, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 6, 1},
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
                {1, 0, 0, 0, 0, 1, 0, 1, 2, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1},
                {1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1},
                {1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1},
                {1, 4, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 5, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        };

        for (int x = 0; x < cols; x++) {
            for (int y = 0; y < rows; y++) {

                int gameObject = supermap[y][x];

                if (gameObject == 0) {
                    Rectangle rectangle = new Rectangle(x*cellSize+10,y*cellSize +10,cellSize,cellSize);
                    rectangle.fill();
                    Coin coin = new Coin(new SimpleGfxGridPosition(x, y, grid, new Picture(x * cellSize + 10, y
                            * cellSize + 10, "gameResources/images/objects/Java Cup.png")));
                    coin.getPos().getPicture().draw();
                    objectlist.add(coin);
                    continue;

                }
                if (gameObject == 1) {

                    Wall wall = new Wall(new SimpleGfxGridPosition(x, y, grid, new Picture(x * cellSize + 10, y
                            * cellSize + 10, "gameResources/images/objects/Wall.png")));
                    wall.getPos().getPicture().draw();
                    objectlist.add(wall);
                    continue;

                }
                if (gameObject == 2) {
                    Rectangle rectangle = new Rectangle(x*cellSize+10,y*cellSize +10,cellSize,cellSize);
                    rectangle.fill();
                    playerx = x;
                    playery = y;
                    continue;

                }
                if (gameObject == 3) {
                    faustinox = x;
                    faustinoy = y;
                    Rectangle rectangle = new Rectangle(x*cellSize+10,y*cellSize +10,cellSize,cellSize);
                    rectangle.fill();
                    continue;

                }
                if (gameObject == 4) {
                    Rectangle rectangle = new Rectangle(x*cellSize+10,y*cellSize +10,cellSize,cellSize);
                    rectangle.fill();
                    maryx = x;
                    maryy = y;
                    continue;

                }
                if (gameObject == 5) {
                    Rectangle rectangle = new Rectangle(x*cellSize+10,y*cellSize +10,cellSize,cellSize);
                    rectangle.fill();
                    fernadsx = x;
                    fernadsy = y;
                    continue;

                }
                if (gameObject == 6) {
                    Rectangle rectangle = new Rectangle(x*cellSize+10,y*cellSize +10,cellSize,cellSize);
                    rectangle.fill();
                    bigotesx = x;
                    bigotesy = y;
                    continue;

                }
                if (gameObject == 7) {
                    Rectangle rectangle = new Rectangle(x*cellSize+10,y*cellSize +10,cellSize,cellSize);
                    rectangle.fill();
                    Wall wall = new Wall(new SimpleGfxGridPosition(x, y, grid, new Picture(x * cellSize + 10, y
                            * cellSize + 10, "gameResources/images/objects/RedWall.png")));
                    wall.getPos().getPicture().draw();
                    objectlist.add(wall);

                }
                if (gameObject == 8) {
                    new SimpleGfxGridPosition(x, y, grid);

                }
            }
        }

        bigotes = new Bigotes(new SimpleGfxGridPosition(bigotesx, bigotesy, grid, new Picture(bigotesx * cellSize + 10, bigotesy
                * cellSize + 10, "gameResources/images/ghosts/bigotteghostsize.png")), GhostType.BIGOTES);

        bigotes.getPos().getPicture().draw();

        fernands = new Fernands(new SimpleGfxGridPosition(fernadsx, fernadsy, grid, new Picture(fernadsx * cellSize + 10, fernadsy
                * cellSize + 10, "gameResources/images/ghosts/fernadzghostsize.png")), GhostType.FERNANDS);

        fernands.getPos().getPicture().draw();

        mary = new Mary(new SimpleGfxGridPosition(maryx, maryy, grid, new Picture(maryx * cellSize + 10, maryy
                * cellSize + 10, "gameResources/images/ghosts/marighostsize.png")), GhostType.MARY);

        mary.getPos().getPicture().draw();

        Picture picture = new Picture(faustinox * cellSize + 10, faustinoy * cellSize + 10, "gameResources/images/ghosts/faustinoghostsize.png");

        SimpleGfxGridPosition gp = new SimpleGfxGridPosition(faustinox, faustinoy, grid, picture);

        tioFaustino = new TioFaustino(gp, GhostType.TIO_FAUSTINO);

        tioFaustino.getPos().getPicture().draw();

        pictureArrayList = new ArrayList<>();

        pictureArrayList.add(new Picture(playerx * cellSize + 10,
                playery * cellSize + 10, "gameResources/images/playableCharacters/andeghostsize.png"));
        pictureArrayList.add(new Picture(playerx * cellSize + 10,
                playery * cellSize + 10, "gameResources/images/playableCharacters/danonesghostsize.png"));
        pictureArrayList.add(new Picture(playerx * cellSize + 10,
                playery * cellSize + 10, "gameResources/images/playableCharacters/titighostsize.png"));
        pictureArrayList.add(new Picture(playerx * cellSize + 10,
                playery * cellSize + 10, "gameResources/images/playableCharacters/vitinhoghostsize.png"));

        pc = new PlayableCharacter(
                new SimpleGfxGridPosition(
                        playerx,
                        playery,
                        grid,
                        pictureArrayList.get((int) (Math.random() * pictureArrayList.size()))));
        pc
                .getPos()
                .getPicture()
                .draw();

        objectlist.add(bigotes);

        ghostArrayList.add(bigotes);

        objectlist.add(fernands);

        ghostArrayList.add(fernands);

        objectlist.add(tioFaustino);

        ghostArrayList.add(tioFaustino);

        objectlist.add(mary);

        ghostArrayList.add(mary);
    }

    public void init() {

        gridMaker(grid);
        colisionDetector = new ColisionDetector(objectlist);
        pc.setColisionDetector(colisionDetector);
        colisionDetector.setPlayableCharacter(pc);

        for (Ghost ghost : ghostArrayList
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

    public PlayableCharacter getPlayabaleCharachter() {
        return pc;
    }

    public void moveAllGhost() {
        for (Ghost ghost : ghostArrayList) {
            ghost.move();
        }
    }

    void start() throws InterruptedException {
        while (true) {
            if (!getPlayabaleCharachter().isDead()) {
                // Pause for a while
                Thread.sleep(100);
                moveAllGhost();
            }
        }
    }

    public void setGrid(SimpleGfxGrid grid) {
        this.grid = grid;
    }
}