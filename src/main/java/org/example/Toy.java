package org.example;

public class Toy {

    int id;
    String name;
    int probability;

    Toy(String id, String textname, String probability) {
        this.name = textname;

        try {
            this.id = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            this.id = 0;
        };

        try {
            this.probability = Integer.parseInt(probability);
        } catch (NumberFormatException e) {
            this.probability = 0;
        };

    }
}
