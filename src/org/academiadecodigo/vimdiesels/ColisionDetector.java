package org.academiadecodigo.vimdiesels;

import org.academiadecodigo.vimdiesels.GameObject.GameObject;
import org.academiadecodigo.vimdiesels.GameObject.Ghost;
import org.academiadecodigo.vimdiesels.GameObject.PlayableCharacter;
import org.academiadecodigo.vimdiesels.grid.position.GridPosition;

import java.util.*;

public class ColisionDetector {


    private ArrayList<GameObject> objects;

    public ColisionDetector(ArrayList<GameObject> objects) {
        this.objects = objects;
    }

    public boolean isUnSafe(int col, int row) {

        for (GameObject gameObject : objects
        ) {

            return (gameObject instanceof Ghost && gameObject.getPos().getCol() == col && gameObject.getPos().getRow() == row);

        }

/*
        for (int i = 0; i < objects.size(); i++) {

            if (objects.get(i) instanceof PlayableCharacter) {
                if ((objects.get(i).getPos().getCol() == col && objects.get(i).getPos().getRow() == row) && !(objects.get(i).isDead())) {
                    ((PlayableCharacter) objects.get(i)).die();
                    return true;
                }

            }
        }
        return false;
    }*/
        return false;
    }

    public boolean wallColision(int col, int row) {


        for (GameObject gameObejct: objects
             ) {
            return (gameObejct.getPos().getCol() == col &&  gameObejct.getPos().getRow() == row);
        }

        return false;

     /*
        for (int i = 0; i < objects.size(); i++) {

            if (objects.get(i) instanceof PlayableCharacter || objects.get(i) instanceof Ghost) {

                if ((objects.get(i).getPos().getCol() == col && objects.get(i).getPos().getRow() == row)) {
                    return true;
                }
            }

        }
        return false;
*/
    }


}

