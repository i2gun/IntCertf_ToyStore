package org.example;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Toys implements Iterator<Toy> {

    private Queue<Toy> toyList;

    Toys() {
        toyList = new PriorityQueue<>((o1, o2) -> 0);
    }

    public void addToys(Toy newToy) {
        toyList.add(newToy);
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
