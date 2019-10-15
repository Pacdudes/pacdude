package org.academiadecodigo.vimdiesels.GameObject;

public class GameObjectFactory {

    public static Ghost[] getNewGhost() {
        Ghost[] ghostArray = new Ghost[GhostType.values().length];

        for (int i = 0; i < GhostType.values().length; i++) {
        }
        return ghostArray;
    }
}
