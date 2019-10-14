package org.academiadecodigo.vimdiesels;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Game {
    private static final double PADDING = 10;
    private Rectangle scrollbar;
    private Rectangle redSquare;

    private Keyboard keyboard;
    private KeyboardHandler testKeyboardHandler;

    public Game() {

        this.scrollbar = new Rectangle(PADDING,PADDING,200,50);
        this.redSquare = new Rectangle(PADDING,PADDING,50,50);

        testKeyboardHandler = new XptoKeyboardHandler(redSquare);
        keyboard = new Keyboard(testKeyboardHandler);



    }

    public void init() {
        scrollbar.setColor(Color.LIGHT_GRAY);
        scrollbar.fill();
        redSquare.setColor(Color.RED);
        redSquare.fill();

        // TODO: 02/10/2019 encapsulate this code in a method
        KeyboardEvent e = new KeyboardEvent();
        e.setKey(KeyboardEvent.KEY_RIGHT);
        e.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(e);
    }

    public void start() {
    }
}
