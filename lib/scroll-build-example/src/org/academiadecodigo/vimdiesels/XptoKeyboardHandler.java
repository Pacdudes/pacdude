package org.academiadecodigo.vimdiesels;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;



public class XptoKeyboardHandler implements KeyboardHandler {

    private Rectangle redSquare;

    public XptoKeyboardHandler(Rectangle redSquare) {
        this.redSquare = redSquare;
    }

    @Override
    public void keyPressed(KeyboardEvent e) {
        switch (e.getKey()){
            case KeyboardEvent.KEY_RIGHT:
                this.redSquare.translate(1,0);
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
