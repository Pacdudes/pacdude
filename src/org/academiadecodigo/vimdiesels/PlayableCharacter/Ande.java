package org.academiadecodigo.vimdiesels.PlayableCharacter;

import org.academiadecodigo.vimdiesels.GameObject.PlayableCharacter;

public class Ande extends PlayableCharacter {

    private String name;
    private int health;
    private int speed;

    public Ande(String name, int health, int speed) {
        super(name, health, speed);
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