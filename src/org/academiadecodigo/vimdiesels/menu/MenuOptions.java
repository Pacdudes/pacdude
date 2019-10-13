package org.academiadecodigo.vimdiesels.menu;

import org.academiadecodigo.vimdiesels.Game;

public enum MenuOptions {

    START_GAME(Game.resourcesImages + "menu/Start-Game-Hover.png"),
    QUIT(Game.resourcesImages + "menu/Quit-Game-Hover.png");

    private String selected;
    private String unselected;

    MenuOptions (String selected) {
        this.selected = selected ;
        this.unselected = unselected;
    }

    public String getSelected() {
        return selected;
    }

    public String getUnselected() {
        return unselected;
    }



}
