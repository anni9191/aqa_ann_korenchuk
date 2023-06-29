package org.hillel.dance;

public class Ballet extends Dance {
    public class Ballet
        int year;
        String type;
        String[] positions;

        public Ballet(int choreography, String name, int year, String type, String[] positions) {
            super(choreography, name);
            this.year = year;
            this.type = type;
            this.positions = positions;
        }

        public Ballet(int choreography) {
            this.choreorgaphy = choreography;
        }

    }
}
