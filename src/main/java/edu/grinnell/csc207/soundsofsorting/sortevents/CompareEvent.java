package edu.grinnell.csc207.soundsofsorting.sortevents;

import java.util.ArrayList;
import java.util.List;

/**
 * A <code>CompareEvent</code> logs a comparison a sort makes between two
 * indices in the array.
 */
public class CompareEvent<T> implements SortEvent {
    private int index1;
    private int index2;

    /**
     * Compare events created by the sort
     * @param index1 the first index
     * @param index2 the second index
     */
    public CompareEvent(int index1, int index2) {
        this.index1 = index1;
        this.index2 = index2;
    }

    /**
     * Apply the event to the array
     * @param arr the array to apply the event to
     */
    public void apply(Object[] arr) {
    }

    /**
     * Returns the list of indices affected by compare
     */
    public List getAffectedIndices() {
        List<Integer> compare = new ArrayList<>();
        compare.add(index1);
        compare.add(index2);
        return compare;
    }

    /**
     * Returns false because campare events are not emphasised
     */
    public boolean isEmphasized() {
        return false;
    }
}
