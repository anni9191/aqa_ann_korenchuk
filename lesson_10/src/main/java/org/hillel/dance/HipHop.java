package org.hillel.dance;

public class HipHop extends AfroDance{

        public String choreographer;
        public String style;

        public HipHop (int choreography, String name, String moves, int yearOfCreation, String choreographer, String style, int priceForLesson) {
            super(choreography, name, moves, yearOfCreation, priceForLesson);
            this.choreographer = choreographer;
            this.style = style;
            countryOfDance = "USA";
        }

        public HipHop (String choreographer, String style) {
            this.choreographer = choreographer;
            this.style = style;
        }

    @Override
    public String toString() {
        return "HipHop{" +
                "choreographer='" + choreographer + '\'' +
                ", style='" + style + '\'' +
                '}';
    }

}
