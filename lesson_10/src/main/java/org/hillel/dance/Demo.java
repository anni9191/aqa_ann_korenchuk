package org.hillel.dance;

import org.hillel.dance.Ballet;
import org.hillel.dance.Flamenco;

public class Demo {

    public static void main(String[] args) {
        Flamenco flamenco = new Flamenco (2,"Faruca",true,25);
        System.out.println(flamenco.countryOfDance);
        String[] positions = {"handsUp"};
        Ballet carmen = new Ballet(1, "Carmen", 1967, "suita", positions, 50) {
            @Override
            public int calculatePriceForLesson() {
                return 0;
            }
        };
/*
        carmen.setType(null);


        System.out.println(carmen.getType().toString());
*/
    }


}
