package org.academiadecodigo.vimdiesels.gfx;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.vimdiesels.Game;
import org.academiadecodigo.vimdiesels.menu.MenuOptions;

public class MainMenu {


    private String pathImages = Game.resourcesImages + "menu/";
    private Picture [] menuOptions = new Picture[2];
    private Picture [] menuSelected = new Picture[2];

    public MainMenu(){
        drawMainMenu();
    }

    public void drawMainMenu(){

        menuOptions[0] = new Picture(336,700, MenuOptions.START_GAME.getUnselected());
        menuSelected[0] = new Picture(336,700,)



    }
}
