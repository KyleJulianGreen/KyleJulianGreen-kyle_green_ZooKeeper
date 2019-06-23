package com.merit.zoo_keeper;

public class GorillaTest {
    public static void main(String[] args){
        Gorilla gorilla = new Gorilla();
        gorilla.throwSomething().
                throwSomething().
                throwSomething().
                eatBananas().
                eatBananas().
                eatBananas().
                climb().
                climb();
        gorilla.displayEnergy();
    }
}
