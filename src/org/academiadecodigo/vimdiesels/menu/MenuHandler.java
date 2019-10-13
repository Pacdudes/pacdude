package org.academiadecodigo.vimdiesels.menu;

import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.vimdiesels.Game;
import org.academiadecodigo.vimdiesels.gfx.MainMenu;

public class MenuHandler implements KeyboardHandler {

    private MainMenu gfxMainMenu;
    private MenuOptions menuOptions;
    private Game game;
    private boolean mainMenu;

    public MenuHandler(Game game) {

        this.game = game;
        this.gfxMainMenu = new MainMenu();
        gfxMainMenu.drawMainMenu();
        this.mainMenu = true;

    }




    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch(keyboardEvent.getKey()){

            case KeyboardEvent.KEY_UP:
                if(MenuOptions.valueOf(
        }


    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
