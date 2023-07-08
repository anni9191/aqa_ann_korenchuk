package org.hillel.dance;

public class HipHop extends AfroDance{

        public String choreographer;
        public String style;

        public HipHop (int choreography, String name, String moves, int yearOfCreation, String choreographer, String style) {
            super(choreography, name, moves, yearOfCreation);
            this.choreographer = choreographer;
            this.style = style;
            countryOfDance = "USA";
        }

        public HipHop (String choreographer, String style) {
            this.choreographer = choreographer;
            this.style = style;
        }

}
