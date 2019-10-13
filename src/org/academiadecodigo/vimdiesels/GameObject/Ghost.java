package org.academiadecodigo.vimdiesels.GameObject;

import org.academiadecodigo.vimdiesels.gfx.SimpleGFX.SimpleGfxGridPosition;
import org.academiadecodigo.vimdiesels.grid.Grid;
import org.academiadecodigo.vimdiesels.grid.GridDirection;
import org.academiadecodigo.vimdiesels.grid.position.GridPosition;

public class Ghost extends GameObject {


    private SimpleGfxGridPosition pos;
    private GridDirection currentDirection;
    private GhostType GhostType;

    public Ghost(SimpleGfxGridPosition pos) {
        this.pos = pos;
        currentDirection = GridDirection.values()[(int) (Math.random() * GridDirection.values().length)];
    }

    public void move() {

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
    @Override
    public SimpleGfxGridPosition getPos() {
        return pos;
    }
}
