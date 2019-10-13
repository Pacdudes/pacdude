package org.academiadecodigo.vimdiesels.gfx;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.vimdiesels.Game;

public class GameOver {

    private String pathImages = Game.resourcesImages +"menu/";
    private Picture gameOverBackground;

    public GameOver(){
        drawGameOver();
    }

    public void drawGameOver(){

        gameOverBackground = new Picture(0,0,pathImages + "gameoverBackground2.png");

        gameOverBackground.draw();




    }

}

