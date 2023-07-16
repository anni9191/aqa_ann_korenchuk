package org.hillel.dance;

public abstract class Dance {

    private int choreography;
    private String name;
    private int priceForLesson;

    protected String countryOfDance;

    public Dance(int choreography, String name, int priceForLesson) {
        this.choreography = choreography;
        this.name = name;
        this.priceForLesson = priceForLesson;
    }

    public int getPriceForLesson() {
        return priceForLesson;
    }

    public void setPriceForLesson(int priceForLesson) {
        this.priceForLesson = priceForLesson;
    }

    public abstract int calculatePriceForLesson();

    public Dance() {
    }

    @Override
    public String toString() {
        return "Dance{" +
                "choreography=" + choreography +
                ", name='" + name + '\'' +
                ", priceForLesson=" + priceForLesson +
                ", countryOfDance='" + countryOfDance + '\'' +
                '}';
    }
}

