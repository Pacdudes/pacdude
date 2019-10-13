package org.academiadecodigo.vimdiesels.menu;

import org.academiadecodigo.vimdiesels.Game;
import org.academiadecodigo.vimdiesels.gfx.MainMenu;

public class MenuHandler {

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

    public void keyUp(){
        if (!mainMenu){
            return;
        }

       // if(menuOptions.)
    }

}
