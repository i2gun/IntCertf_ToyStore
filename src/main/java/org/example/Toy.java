package org.example;

public class Toy {

    private int id;
    private String name;
    private int rate;
    private int occurrence;

    Toy(int toyId, int dropRate, String toyName) {
        this.name = toyName;
        this.id = toyId;
        this.rate = dropRate;

        resetOccurrence();
    }

    public void resetOccurrence() {
        occurrence = rate;
    }

    @Override
    public String toString() {
        return "id = " + id + " | name = " + name + " | rate = " + rate;
    }
}
