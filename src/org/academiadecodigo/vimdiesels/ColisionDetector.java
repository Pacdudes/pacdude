package org.academiadecodigo.vimdiesels;
import org.academiadecodigo.bootcamp.Sound;
import org.academiadecodigo.vimdiesels.GameObject.*;
import org.academiadecodigo.vimdiesels.grid.position.GridPosition;
import java.util.*;
public class ColisionDetector {

    private ArrayList<GameObject> objects;
    private PlayableCharacter playableCharacter;
    private Sound coinEaten;


    public ColisionDetector(ArrayList<GameObject> objects) {
        this.objects = objects;
    }
    public boolean isUnSafe(int col, int row) {
        boolean verify = false;
        for (int i = 0; i < objects.size(); i++) {
            if (objects.get(i).getPos().getCol() == col && objects.get(i).getPos().getRow() == row && objects.get(i) instanceof Ghost) {
                verify = true;
                break;
            }
        }
        return verify;
    }
    public boolean wallColision(int col, int row) {
        boolean verify = false;
        for (int i = 0; i < objects.size(); i++) {
            if (objects.get(i).getPos().getCol() == col && objects.get(i).getPos().getRow() == row && objects.get(i) instanceof Wall) {
                verify = true;
                break;
            }
        }
        return verify;
    }
    public boolean coinColision(int col, int row) {
        boolean verify = false;
        for (int i = 0; i < objects.size(); i++) {
            if (objects.get(i).getPos().getCol() == col && objects.get(i).getPos().getRow() == row && objects.get(i) instanceof Coin) {
                if (objects.get(i).getPos().getPicture() != null) {
                    verify = true;
                    objects.get(i).getPos().getPicture().delete();
                    objects.get(i).getPos().setPicture(null);
                    coinEaten = new Sound("/gameResources/sounds/stage/eatingCoins.wav");
                    coinEaten.play(true);
                    break;
                }
            }
        }
        return verify;
    }
    public boolean playerCollision(int col, int row) {
        boolean verify = false;
        if (playableCharacter.getPos().getCol() == col && playableCharacter.getPos().getRow() == row) {
            verify = true;
            playableCharacter.die();
        }
        return verify;
    }
    public ArrayList<GameObject> getObjects() {
        return objects;
    }
    public PlayableCharacter getPlayableCharacther() {
        return playableCharacter;
    }
    public void setPlayableCharacter(PlayableCharacter playableCharacter) {
        this.playableCharacter = playableCharacter;
    }
}