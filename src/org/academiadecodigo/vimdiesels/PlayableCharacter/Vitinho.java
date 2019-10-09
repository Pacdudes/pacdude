package org.academiadecodigo.vimdiesels.PlayableCharacter;

import org.academiadecodigo.vimdiesels.GameObject.PlayableCharacter;
import org.academiadecodigo.vimdiesels.grid.position.GridPosition;

public class Vitinho extends PlayableCharacter {

    private String name;
    private int health;
    private int speed;
    private GridPosition pos;

    public Vitinho(String name, int health, int speed, GridPosition pos) {
        super(name, health, speed, pos);
    }

    @Override
    public void move() {
    }

    @Override
    public boolean isDead() {
        return super.isDead();
    }

    @Override
    public void die() {
        super.die();
    }
}