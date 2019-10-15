package org.academiadecodigo.vimdiesels.gfx;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.vimdiesels.Game;

public class GameOver {


    private Picture gameOverBackground;

    public GameOver(Game game){
        drawGameOver();
    }


    public void drawGameOver(){

        gameOverBackground = new Picture(0,0,"gameResources/images/menu/gameoverBackground2.png");
        gameOverBackground.draw();

    }

}

