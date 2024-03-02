package org.example;

public class Main {

    public static void main(String[] args) {
        String[] toyProperties = {
                "1 3 Puzzle",
                "2 4 Drone",
                "3 3 Penguin"
        };

        ToyShop toyShop = new ToyShop(toyProperties);

        toyShop.getToyAndWriteToFile();
    }
}