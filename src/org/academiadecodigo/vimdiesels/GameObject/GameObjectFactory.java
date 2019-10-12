package org.academiadecodigo.vimdiesels.GameObject;

import org.academiadecodigo.vimdiesels.PlayableCharacter.Ande;
import org.academiadecodigo.vimdiesels.PlayableCharacter.Danones;
import org.academiadecodigo.vimdiesels.PlayableCharacter.Titi;
import org.academiadecodigo.vimdiesels.PlayableCharacter.Vitinho;

public class GameObjectFactory {

    public static Ghost[] getNewGhost() {
        Ghost[] ghostArray = new Ghost[GhostType.values().length];

        for (int i = 0; i < GhostType.values().length; i++) {

            //ghostArray[i] = new Ghost(GhostType.values()[i] );

        }
        return ghostArray;
    }


/*
    public static PlayableCharacter getNewPlayableCharacter() {
        // TODO: 06/10/2019 Nao é suposto ser aleatorio
        PlayableCharacterType player = PlayableCharacterType.values()[(int) Math.random() * PlayableCharacterType.values().length];

        PlayableCharacter playableCharacter;
        switch (player) {

            case ANDE:
                return new Ande("Ande", 100, 2);

            case TITI:
                return new Titi();

            case DANONES:
                return new Danones();

            case VITINHO:
                return new Vitinho();

        }

        return playableCharacter;
    }
*/

}
