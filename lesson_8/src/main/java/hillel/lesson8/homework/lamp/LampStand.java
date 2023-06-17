package hillel.lesson8.homework.lamp;

public class LampStand {

    int yearOfProduction;
     String material;

    public LampStand(int yearOfProduction, String material) {
        this.yearOfProduction = yearOfProduction;
        this.material = material;
    }

    public String printLampStand(){
        return " yearOfProduction: " + yearOfProduction + " material: " + material +";";
    }
}
