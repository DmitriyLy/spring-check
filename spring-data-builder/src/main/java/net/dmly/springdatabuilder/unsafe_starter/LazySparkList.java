package net.dmly.springdatabuilder.unsafe_starter;

import lombok.experimental.Delegate;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LazySparkList implements List {

    @Delegate
    private List content;

}
