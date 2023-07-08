package org.hillel.dance;

public class Ballet extends Dance {

    public int year;
    private String type;
    public String[] positions;


    public Ballet(int choreography, String name, int year, String type, String[] positions) {
        super(choreography, name);
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

}
