package org.academiadecodigo.vimdiesels.menu;

import org.academiadecodigo.bootcamp.Sound;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.vimdiesels.Game;


public class GameOverHandler implements KeyboardHandler {

    private Game game;
    private Sound gameOverSound;
    private Keyboard keyboard;
    private Picture picture;
    private Rectangle rectangle;

    public GameOverHandler(Game game) {
        this.game = game;
        gameOverSound = new Sound("/gameResources/sounds/stage/gameOver.wav");
        gameOverSound.play(true);
        gameOverSound.setLoop(100);
        picture = new Picture(0, 0, "gameResources/images/menu/GameOverFinal.png");
        this.keyboard = new Keyboard(this);
        init();

    }

    public void init() {
        picture.draw();

        KeyboardEvent event_space = new KeyboardEvent();
        event_space.setKey(KeyboardEvent.KEY_SPACE);
        event_space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_SPACE) {

            game.gridReset();

        }
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
