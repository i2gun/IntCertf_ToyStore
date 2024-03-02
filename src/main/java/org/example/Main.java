package org.example;

import java.util.Comparator;

public class Main {

    private static final int iterationNumber = 10;

    public static void main(String[] args) {
        runTestProject();
    }

    private static void runTestProject() {
        Toys defaultOrderedToys = createDefaultPriorityQueue();
        Toys ascendingOrderedToys = createAscendingPriorityQueue();
        Toys descendingOrderedToys = createDescendingPriorityQueue();

        printOrderedToys(defaultOrderedToys, "Toys in default order:");
        printOrderedToys(ascendingOrderedToys, "Toys in ascending order:");
        printOrderedToys(descendingOrderedToys, "Toys in descending order:");
    }

    private static void printOrderedToys(Toys orderedToys, String message) {
        System.out.println(message);
        for (int i = 0; i < iterationNumber; i++) {
            System.out.println(orderedToys.getToy());
        }
        System.out.println();
    }

    private static Toys createDefaultPriorityQueue() {
        Toys defaultOrder = new Toys();

        defaultOrder.addToy(new Toy("0", "Jigsaw Puzzle", "7"));
        defaultOrder.addToy(new Toy("1", "Remote Control Drone", "4"));
        defaultOrder.addToy(new Toy("2", "Water Gun", "9"));
        defaultOrder.addToy(new Toy("3", "Building Blocks", "5"));
        defaultOrder.addToy(new Toy("4", "Fidget Spinner", "8"));
        defaultOrder.addToy(new Toy("5", "Play-Doh Set", "6"));
        defaultOrder.addToy(new Toy("6", "Stuffed Penguin", "3"));
        defaultOrder.addToy(new Toy("7", "Mini Basketball Hoop", "10"));
        defaultOrder.addToy(new Toy("8", "Dress-up Costume", "2"));
        defaultOrder.addToy(new Toy("9", "Toy Telescope", "1"));

        return defaultOrder;
    }

    private static Toys createAscendingPriorityQueue() {
        Comparator<Toy> ascendingToyRate = Comparator.comparingInt(o -> o.rate);
        Toys ascendingOrder = new Toys(ascendingToyRate);

        ascendingOrder.addToy(new Toy("0", "Slime", "3"));
        ascendingOrder.addToy(new Toy("1", "Teddy Bear", "5"));
        ascendingOrder.addToy(new Toy("2", "Rubik's Cube", "7"));
        ascendingOrder.addToy(new Toy("3", "Yo-yo", "4"));
        ascendingOrder.addToy(new Toy("4", "Kite", "6"));
        ascendingOrder.addToy(new Toy("5", "Coloring Book", "2"));
        ascendingOrder.addToy(new Toy("6", "Jump Rope", "8"));
        ascendingOrder.addToy(new Toy("7", "Slinky", "9"));
        ascendingOrder.addToy(new Toy("8", "Frisbee", "1"));
        ascendingOrder.addToy(new Toy("9", "Play Kitchen Set", "10"));

        return ascendingOrder;
    }

    private static Toys createDescendingPriorityQueue() {
        Comparator<Toy> descendingToyRate = (o1, o2) -> o2.rate - o1.rate;
        Toys descendingOrder = new Toys(descendingToyRate);

        descendingOrder.addToy(new Toy("0", "Football", "8"));
        descendingOrder.addToy(new Toy("1", "Doll", "7"));
        descendingOrder.addToy(new Toy("2", "Action Figure", "6"));
        descendingOrder.addToy(new Toy("3", "Puzzle", "5"));
        descendingOrder.addToy(new Toy("4", "Remote Control Car", "4"));
        descendingOrder.addToy(new Toy("5", "Board Game", "9"));
        descendingOrder.addToy(new Toy("6", "LEGO Set", "3"));
        descendingOrder.addToy(new Toy("7", "Stuffed Animal", "2"));
        descendingOrder.addToy(new Toy("8", "Model Train", "1"));
        descendingOrder.addToy(new Toy("9", "Play-Doh", "10"));

        return descendingOrder;
    }
}