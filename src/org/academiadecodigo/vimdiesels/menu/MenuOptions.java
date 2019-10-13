package org.academiadecodigo.vimdiesels.menu;

public enum MenuOptions {

    START_GAME("image.txt", "image.txt"),
    QUIT("image.txt", "image.txt");

    private String selected;
    private String unselected;

    MenuOptions (String selected, String unselected) {
        this.selected = selected;
        this.unselected = unselected;
    }

    public String getSelected() {
        return selected;
    }

    public String getUnselected() {
        return unselected;
    }



}
