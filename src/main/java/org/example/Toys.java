package org.example;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Toys implements Iterator<Toy> {

    private Queue<Toy> toyList;
    private int totalRate;

    Toys() {
        toyList = new PriorityQueue<>();
    }

    public void addToys(int id, int rate, String name) {
        Toy newToy = new Toy(id, rate, name);
        for (int i = 0; i < rate; i++) {
            toyList.add(newToy);
        }
        totalRate += newToy.getRate();
    }

    public int getTotalRate() {
        return totalRate;
    }

    @Override
    public boolean hasNext() {
        return !toyList.isEmpty();
    }

    @Override
    public Toy next() {
        return toyList.poll();
    }
}
