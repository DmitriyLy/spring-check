package net.dmly.springdatabuilder.unsafe_starter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderedBag<T> {

    private List<T> list = new ArrayList<>();

    public OrderedBag(T[] args) {
        this.list = new ArrayList<>(Arrays.asList(args));
    }

    public T takeAndRemove() {
        return list.remove(0);
    }

    public int size() {
        return list.size();
    }

}
