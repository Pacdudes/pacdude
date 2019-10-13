package org.academiadecodigo.vimdiesels.menu;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.vimdiesels.Game;

public class GameOverHandler implements KeyboardHandler {

    private Game game;

    public GameOverHandler(Game game) {
        this.game = game;
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        keyboardEvent = new KeyboardEvent();
        keyboardEvent.setKey(KeyboardEvent.KEY_SPACE);
        keyboardEvent.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_SPACE){
            game.init();
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
