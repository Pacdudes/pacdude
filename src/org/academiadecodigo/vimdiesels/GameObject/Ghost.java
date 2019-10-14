package org.academiadecodigo.vimdiesels.GameObject;

import org.academiadecodigo.vimdiesels.ColisionDetector;
import org.academiadecodigo.vimdiesels.gfx.SimpleGFX.SimpleGfxGrid;
import org.academiadecodigo.vimdiesels.gfx.SimpleGFX.SimpleGfxGridPosition;
import org.academiadecodigo.vimdiesels.grid.Grid;
import org.academiadecodigo.vimdiesels.grid.GridDirection;
import org.academiadecodigo.vimdiesels.grid.position.GridPosition;

public class Ghost extends GameObject {


    private SimpleGfxGridPosition pos;
    private GridDirection currentDirection;
    private ColisionDetector colisionDetector;
    private GhostType GhostType;
    private boolean move;
    private static final int distance = 1;

    public Ghost(SimpleGfxGridPosition pos, GhostType ghostType) {
        this.pos = pos;
        this.move = true;
        this.GhostType = ghostType;
        currentDirection = GridDirection.values()[(int) (Math.random() * GridDirection.values().length)];
    }


    public GridDirection chooseDirection() {

        // Let's move in the same direction by default
        GridDirection newDirection = currentDirection;

        // Sometimes, we want to change direction...
        if (Math.random() > ((double) GhostType.getDirectionChangeProbability()) / 10) {
            newDirection = GridDirection.values()[(int) (Math.random() * GridDirection.values().length)];

            // but we do not want to perform U turns..
            if (newDirection.isOpposite(currentDirection)) {
                return chooseDirection();
            }
        }

        return newDirection;

    }

    /*
        public move() {

            if (isDead()) {
                return;
            }

            chooseDirection();

            switch (Movement) {
                case LEFT:
                    if (!collisionDetector.isUnSafe(getPos().getCol() - 1, getPos().getRow())) {
                        getPos().moveInDirection(GridDirection.LEFT, 1);
                        break;
                    }
                    break;
                case RIGHT:
                    if (!collisionDetector.isUnSafe(getPos().getCol() + 1, getPos().getRow())) {
                        getPos().moveInDirection(GridDirection.RIGHT, 1);
                        break;
                    }
                    break;
                case UP:
                    if (!collisionDetector.isUnSafe(getPos().getCol(), getPos().getRow() - 1)) {
                        getPos().moveInDirection(GridDirection.UP, 1);
                        break;
                    }
                    break;
                case DOWN:
                    if (!collisionDetector.isUnSafe(getPos().getCol(), getPos().getRow() + 1)) {
                        getPos().moveInDirection(GridDirection.DOWN, 1);
                        break;
                    }
                    break;
                default:
            }


        }*/
    public void move() {

        GridDirection direction = this.currentDirection;

        switch (direction) {
            case UP:
                if (colisionDetector.wallColision(this.getPos().getCol(), this.getPos().getRow() - distance)) {
                    this.currentDirection = chooseDirection();
                    break;
                }
                this.pos.moveInDirection(this.currentDirection, distance);
                break;

            case DOWN:
                if (colisionDetector.wallColision(this.getPos().getCol(), this.getPos().getRow() + distance)) {
                    this.currentDirection = chooseDirection();
                    break;
                }
                this.pos.moveInDirection(this.currentDirection, distance);
                break;


            case LEFT:
                if (colisionDetector.wallColision(this.getPos().getCol() - distance, this.getPos().getRow())) {
                    this.currentDirection = chooseDirection();
                    break;
                }
                this.pos.moveInDirection(this.currentDirection, distance);
                break;
            case RIGHT:
                if (colisionDetector.wallColision(this.getPos().getCol() + distance, this.getPos().getRow())) {
                    this.currentDirection = chooseDirection();
                    break;
                }
                this.pos.moveInDirection(this.currentDirection, distance);
                break;
        }


    }


    @Override
    public SimpleGfxGridPosition getPos() {
        return pos;
    }

    public void setColisionDetector(ColisionDetector colisionDetector) {
        this.colisionDetector = colisionDetector;
    }
}
