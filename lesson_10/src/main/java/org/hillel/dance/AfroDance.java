package org.hillel.dance;

public class AfroDance extends Dance {

    public String moves;
    public int yearOfCreation;

 /*   public AfroDance(int tribes, String , String Monica, int, 1950, String moves, int yearOfCreation) {

  */

    public AfroDance(int choreography, String name, String moves, int yearOfCreation) {
        super(choreography, name);
        this.moves = moves;
        this.yearOfCreation = yearOfCreation;
        countryOfDance = "Africa";
    }
    public AfroDance() {


        }
}
