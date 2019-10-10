package org.academiadecodigo.vimdiesels.GameObject;

import org.academiadecodigo.vimdiesels.grid.Grid;
import org.academiadecodigo.vimdiesels.grid.position.GridPosition;

public class Ghost extends GameObject {

   private String name;
   private int speed;
   private GridPosition pos;
   private Grid grid;

    public Ghost(String name, int speed, GridPosition pos) {
        this.name = name;
        this.speed = speed;
        this.pos = pos;
    }

    public move (){
        /*
        if (isDestroyed()) {
            return;
        }

        chooseDirection();

        switch (currentDirection) {
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
        */
    }
}
