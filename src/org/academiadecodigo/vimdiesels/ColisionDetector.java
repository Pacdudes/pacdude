package org.academiadecodigo.vimdiesels;

import org.academiadecodigo.vimdiesels.GameObject.GameObject;
import org.academiadecodigo.vimdiesels.GameObject.Ghost;
import org.academiadecodigo.vimdiesels.GameObject.PlayableCharacter;
import org.academiadecodigo.vimdiesels.GameObject.Wall;
import org.academiadecodigo.vimdiesels.grid.position.GridPosition;

import java.util.*;

public class ColisionDetector {


    private ArrayList<GameObject> objects;

    public ColisionDetector(ArrayList<GameObject> objects) {
        this.objects = objects;
    }

    public boolean isUnSafe(int col, int row) {
        boolean verify = false;
        for (int i = 0; i <objects.size() ; i++) {
            if (objects.get(i).getPos().getCol() == col && objects.get(i).getPos().getRow() == row && objects.get(i) instanceof Ghost){
                verify = true;
                break;
            }
        }

        return verify;
    }

    public boolean wallColision(int col, int row) {
        boolean verify = false;
        for (int i = 0; i <objects.size() ; i++) {
            if (objects.get(i).getPos().getCol() == col && objects.get(i).getPos().getRow() == row && objects.get(i) instanceof Wall){
                verify = true;
                break;
            }
        }

     return verify;
    }


}

