package net.dmly.springdatabuilder.unsafe_starter;

import java.util.Collection;

public class LazyCollectionInjectorPostFinalizer implements PostFinalizer {
    @Override
    public Object postFinalize(Object retVal) {
        if (Collection.class.isAssignableFrom(retVal.getClass())) {
            return retVal;
        }
        return retVal;
    }
}
