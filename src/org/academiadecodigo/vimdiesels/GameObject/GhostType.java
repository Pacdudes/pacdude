package org.academiadecodigo.vimdiesels.GameObject;

public enum GhostType {

    TIO_FAUSTINO(4),
    MARY(4),
    FERNANDS(4),
    BIGOTES(4);

    private int directionChangeProbability;

    GhostType(int directionChangeProbability) {
        this.directionChangeProbability = directionChangeProbability;
    }

    public int getDirectionChangeProbability() {
        return directionChangeProbability;
    }

}


