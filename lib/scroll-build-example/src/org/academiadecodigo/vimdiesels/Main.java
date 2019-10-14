package org.academiadecodigo.vimdiesels;

public class Main {
    private static final double PADDING = 10;

    public static void main(String[] args) throws InterruptedException {

        Game game = new Game();
        game.init();
        game.start();

    }
}
