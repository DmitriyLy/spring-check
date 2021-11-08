package net.dmly.springdatabuilder.unsafe_starter;

import lombok.Data;
import lombok.experimental.Delegate;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Data
public class LazySparkList implements List {

    @Delegate
    private List content;

    private long ownerId;

    private Class<?> modelClass;

    private String foreignKeyName;

    private String pathToSource;

    public boolean initialized() {
        return content != null /*&& !content.isEmpty()*/;
    }

}
