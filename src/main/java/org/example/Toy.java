package org.example;

public class Toy implements Comparable<Toy> {

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

    public int getRate() {
        return rate;
    }

    public boolean hasOccurrence() {
        return occurrence > 0;
    }

    public void decreaseOccurrence() {
        occurrence--;
    }

    public void resetOccurrence() {
        occurrence = rate;
    }

    @Override
    public String toString() {
        return "id = " + id + " | name = " + name + " | rate = " + rate;
    }

    @Override
    public int compareTo(Toy o) {
        return o.rate - this.rate;
    }
}
