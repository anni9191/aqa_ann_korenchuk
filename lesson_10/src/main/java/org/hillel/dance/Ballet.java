package org.hillel.dance;

import java.util.Arrays;

public abstract class Ballet extends Dance {

    public int year;
    private String type;
    public String[] positions;


    public Ballet(int choreography, String name, int year, String type, String[] positions, int priceForLesson) {
        super(choreography, name, priceForLesson);
        this.year = year;
        this.type = type;
        this.positions = positions;
        countryOfDance = "France";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type != null) {
            this.type = type;
        } else {
            System.out.println("You are trying to set null");
        }

    }

    @Override
    public String toString() {
        return "Ballet{" +
                "year=" + year +
                ", type='" + type + '\'' +
                ", positions=" + Arrays.toString(positions) +
                '}';
    }
}
