package org.example;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Toys {

    Queue<Toy> toyList;

    Toys(Comparator compareRate) {
        toyList = new PriorityQueue<>(compareRate);
    }

    Toys() {
        toyList = new PriorityQueue<>();
    }

    public void addToy(Toy newToy) {
        toyList.add(newToy);
    }

    public Toy getToy() {
        return toyList.poll();
    }
}
