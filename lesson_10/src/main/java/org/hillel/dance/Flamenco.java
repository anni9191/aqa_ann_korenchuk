package org.hillel.dance;

import org.hillel.dance.Dance;
public class Flamenco extends Dance{

   private boolean castanedas;


    public Flamenco(int choreorgaphy, String name, boolean castanedas, int priceForLesson) {
        super(choreorgaphy, name, priceForLesson);
        this.castanedas = castanedas;
        countryOfDance = "Spain";
    }
/*
    @Override
    public int calculatePriceForLesson() {
        return this.getPriceForLesson();
    };
*/

    @Override
    public String toString() {
        return "Flamenco{" +
                "castanedas=" + castanedas +
                '}';
    }

    @Override
    public int calculatePriceForLesson() {
        return 0;
    }
}
