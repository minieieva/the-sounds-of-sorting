package edu.grinnell.csc207.soundsofsorting.sortevents;

import java.util.ArrayList;
import java.util.List;

/**
 * A <code>SwapEvent</code> logs a swap between two indices of the array.
 */
public class SwapEvent<T> implements SortEvent{
    private int index1;
    private int index2;


    /**
     * Compare events created by the sort
     * @param index1 the first index swapped
     * @param index2 the second index swapped
     */
    public SwapEvent(int index1, int index2){
        this.index1 = index1;
        this.index2 = index2;
    }

    /**
     * Apply the event to the array
     * @param arr the array to apply the event to
     */
    public void apply(Object[] arr) {
        Object temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    /**
     * Returns the list of indices affected by swap
     */
    public List getAffectedIndices() {
        List<Integer> swap = new ArrayList<>();
        swap.add(index1);
        swap.add(index2);
        return swap;
    }

    /*
     * Returns true because swap events are emphasised
     */
    public boolean isEmphasized() {
        return true;
    }
}
