package org.hillel.dance;

public class AfroDance extends Dance {

    public String moves;
    public int yearOfCreation;

 /*   public AfroDance(int tribes, String , String Monica, int, 1950, String moves, int yearOfCreation) {

  */

    public AfroDance(int choreography, String name, String moves, int yearOfCreation, int priceForLesson) {
        super(choreography, name, priceForLesson);
        this.moves = moves;
        this.yearOfCreation = yearOfCreation;
        countryOfDance = "Africa";
    }

    @Override
    public int calculatePriceForLesson() {
        return 0;
    }

    public AfroDance() {
        }

    @Override
    public String toString() {
        return "AfroDance{" +
                "moves='" + moves + '\'' +
                ", yearOfCreation=" + yearOfCreation +
                '}';
    }
}
