package com.springandjava.Test.effectivejava.chatper6.item35;

public enum Ensemble {

    SOLO(1), DUET(2), TRIO(3);

    private final int numberOfMusicians;

    Ensemble(int size){
        this.numberOfMusicians = size;
    }

    public int numberOfMusicians(){
        return numberOfMusicians;
    }
}
