package edu.grinnell.csc207.soundsofsorting.sortevents;

import java.util.ArrayList;
import java.util.List;

/**
 * A <code>CopyEvent</code> logs a copy of a value into an index of the array.
 */
public class CopyEvent<T> implements SortEvent{
    private int index;
    private T value;

    /**
     * Copy events created by the sort
     * @param index the index to copy to
     * @param value the value to copy
     */
    public CopyEvent(int index, T value){
        this.index = index;
        this.value = value;
    }

    /**
     * Apply the event to the array
     * @param arr the array to apply the event to
     */
    public void apply(Object[] arr) {
        arr[index] = value;
    }

    /**
     * Returns the list of indices affected by copy
     */
    public List getAffectedIndices() {
        List<Integer> copy = new ArrayList<>();
        copy.add(index);
        return copy;
    }

    /*
     * Returns true because copy events are emphasised.
     */
    public boolean isEmphasized() {
        return true;
    }
}
