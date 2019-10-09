package org.academiadecodigo.vimdiesels.Input;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import java.awt.*;

public class GameKeyboardHandler implements KeyboardHandler {

private Rectangle character;

    @Override
    public void keyPressed(KeyboardEvent e) {

        switch (e.getKey()) {
            case KeyboardEvent.KEY_RIGHT:
                //if(redSquare.getX() <= )
                this.character.translate(10, 0);
                return;
            case KeyboardEvent.KEY_LEFT:
                this.character.translate(-10, 0);
                return;
            case KeyboardEvent.KEY_UP:
                this.character.translate(0, -10);
                return;
            case KeyboardEvent.KEY_DOWN:
                this.character.translate(0, 10);
                return;
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
