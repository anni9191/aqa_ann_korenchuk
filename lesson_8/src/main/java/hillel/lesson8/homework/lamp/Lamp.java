package hillel.lesson8.homework.lamp;

public class Lamp {
    int volt;

    String colour;

    String production;

    LampStand lampStand;

    public Lamp(int volt, String colour, String production, LampStand lampStand) {
        this.volt = volt;
        this.colour = colour;
        this.production = production;
        this.lampStand = lampStand;
    }

    public void printLampCharacteristics() {
        System.out.println("volt: " + volt + " colour: " + colour + " production: " + production + " lampStand: " + lampStand.printLampStand());
    }
}

/*
    public Lamp(){}

    public Lamp(int volt, String colour) {
        this.volt = volt;
        this.colour = colour;
    }


    public void printVolt(){
        System.out.println(volt);
    }

    public void giveLight() {
        System.out.println("Лампа светит");
    }

    public void giveLight(int volt) {
        System.out.println("В настольную лампу вставлена лампочка с количеством вольт: " + volt);
    }

    public void turnOnLamp(int volt) {
        if (this.volt < volt) {
            System.out.println("Лампа перегорела");
        }
    }
}

*/