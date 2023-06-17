package hillel.lesson8.homework.lamp;

import hillel.lesson8.homework.lamp.Lamp;

public class Main1 {

    public static void main(String[] args) {
        Lamp ikea1 = new Lamp(220, "white", "Sweden", new LampStand(2023, "metal"));
        ikea1.printLampCharacteristics();

/*
        Lamp ikea2 = ikea1;

        ikea2.volt = 240;

        System.out.println(ikea1.volt);

        Lamp ikea3 = new Lamp(220, "white");

        System.out.println("volt: "+ikea3.volt + "colour: " + ikea3.colour + "production: " + ikea3.production + "type: " + ikea3.type);

    }

 */
    }
}
