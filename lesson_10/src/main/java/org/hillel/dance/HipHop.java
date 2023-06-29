package org.hillel.dance;

public class HipHop extends AfroDance{

        String choreographer;
        String style;

        public HipHop (int choreography, String name, String creator, int yearOfCreation, String choreographer, String style) {
            super(choreography, name, creator, yearOfCreation);
            this.choreographer = choreographer;
            this.style = style;
        }

        public HipHop (String choreographer, String style) {
            this.choreographer = choreographer;
            this.style = style;
        }
    }
}
