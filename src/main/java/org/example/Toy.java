package org.example;

public class Toy implements Comparable<Toy> {

    int id;
    String name;
    int rate;

    Toy(String toyId, String toyName, String dropRate) {
        this.name = toyName;

        try {
            this.id = Integer.parseInt(toyId);
        } catch (NumberFormatException e) {
            this.id = 0;
        };

        try {
            this.rate = Integer.parseInt(dropRate);
        } catch (NumberFormatException e) {
            this.rate = 0;
        };

    }

    @Override
    public String toString() {
        return "id = " + id + " | name = " + name + " | rate = " + rate;
    }

    @Override
    public int compareTo(Toy o) {
        return this.rate - o.rate;
    }
}
