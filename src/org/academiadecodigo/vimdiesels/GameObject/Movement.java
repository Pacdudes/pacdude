package org.academiadecodigo.vimdiesels.GameObject;

public enum Movement {

    RIGHT,
    LEFT,
    UP,
    DOWN;

    public static Movement opposite(Movement movement) {


        if (movement == RIGHT)
            return LEFT;
        else if (movement == LEFT)
            return RIGHT;
        else if (movement == UP)
            return DOWN;
        else
            return UP;
    }

}
