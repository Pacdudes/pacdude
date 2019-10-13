package org.academiadecodigo.vimdiesels.menu;

public enum MenuOptions {

    START_GAME("Start-Game-Hover.png", "Start-Game.png"),
    QUIT("Quit-Game-Hover.png", "Quit-Game.png");

    private String selected;
    private String unselected;

    MenuOptions (String selected, String unselected) {
        this.selected = selected + ".png";
        this.unselected = unselected + ".png";
    }

    public String getSelected() {
        return selected;
    }

    public String getUnselected() {
        return unselected;
    }



}
