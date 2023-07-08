package org.hillel.dance;

import org.hillel.dance.Dance;
public class Flamenco extends Dance{

   private boolean castanedas;


    public Flamenco(int choreorgaphy, String name, boolean castanedas) {
        super(choreorgaphy, name);
        this.castanedas = castanedas;
        countryOfDance = "Spain";
    }
}
