package edu.grinnell.csc207.soundsofsorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import java.util.function.Consumer;

import org.junit.jupiter.api.Test;

import edu.grinnell.csc207.soundsofsorting.sorts.Sorts;

public class SortsTests {
    /**
     * @param <T> the carrier type of the array
     * @param arr the array to check
     * @return true iff <code>arr</code> is sorted.
     */
    public static <T extends Comparable<? super T>> boolean sorted(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static Integer[] makeTestArray() {
        return new Integer[] {
            3, 7, 9, 1, 2,
            18, 16, 15, 19, 8,
            14, 12, 5, 13, 4,
            6, 0, 17, 11, 10
        };
    }

    public void testSort(Consumer<Integer[]> func) {
        Integer[] arr = makeTestArray();
        func.accept(arr);
        assertTrue(sorted(arr));
    }

    @Test
    public void testBubbleSort() {
        //General array
        Integer[] arr_general = {9, 5, 1, 8, 3, 6};
        Integer[] arr_general_sorted = {1, 3, 5, 6, 8, 9};
        Sorts.bubbleSort(arr_general);
        assertArrayEquals(arr_general, arr_general_sorted);

        //Duplicates array
        Integer[] arr_duplicates = {6, 8, 0, 0, 8, 3};
        Integer[] arr_duplicates_sorted = {0, 0, 3, 6, 8, 8};
        Sorts.bubbleSort(arr_duplicates);
        assertArrayEquals(arr_duplicates, arr_duplicates_sorted);

        //Sorted array
        Integer[] arr_sorted = {1, 2, 3, 4, 5};
        Integer[] arr_sorted_sorted = {1, 2, 3, 4, 5};
        Sorts.bubbleSort(arr_sorted);
        assertArrayEquals(arr_sorted, arr_sorted_sorted);

        //One-element array (edge case)
        Integer[] arr_signle = {7};
        Integer[] arr_single_sorted = {7};
        Sorts.bubbleSort(arr_signle);
        assertArrayEquals(arr_signle, arr_single_sorted);

        //Empty array
        Integer[] arr_empty = {};
        Integer[] arr_empty_sorted = {};
        Sorts.bubbleSort(arr_empty);
        assertArrayEquals(arr_empty, arr_empty_sorted);
    }
    
    @Test
    public void testInsertionSort() {
        //General array
        Integer[] arr_general = {9, 5, 1, 8, 3, 6};
        Integer[] arr_general_sorted = {1, 3, 5, 6, 8, 9};
        Sorts.insertionSort(arr_general);
        assertArrayEquals(arr_general, arr_general_sorted);

        //Duplicates array
        Integer[] arr_duplicates = {6, 8, 0, 0, 8, 3};
        Integer[] arr_duplicates_sorted = {0, 0, 3, 6, 8, 8};
        Sorts.insertionSort(arr_duplicates);
        assertArrayEquals(arr_duplicates, arr_duplicates_sorted);

        //Sorted array
        Integer[] arr_sorted = {1, 2, 3, 4, 5};
        Integer[] arr_sorted_sorted = {1, 2, 3, 4, 5};
        Sorts.insertionSort(arr_sorted);
        assertArrayEquals(arr_sorted, arr_sorted_sorted);

        //One-element array (edge case)
        Integer[] arr_signle = {7};
        Integer[] arr_single_sorted = {7};
        Sorts.insertionSort(arr_signle);
        assertArrayEquals(arr_signle, arr_single_sorted);

        //Empty array
        Integer[] arr_empty = {};
        Integer[] arr_empty_sorted = {};
        Sorts.insertionSort(arr_empty);
        assertArrayEquals(arr_empty, arr_empty_sorted);
    }
    
    @Test
    public void testSelectionSort() {
        //General array
        Integer[] arr_general = {9, 5, 1, 8, 3, 6};
        Integer[] arr_general_sorted = {1, 3, 5, 6, 8, 9};
        Sorts.selectionSort(arr_general);
        assertArrayEquals(arr_general, arr_general_sorted);

        //Duplicates array
        Integer[] arr_duplicates = {6, 8, 0, 0, 8, 3};
        Integer[] arr_duplicates_sorted = {0, 0, 3, 6, 8, 8};
        Sorts.selectionSort(arr_duplicates);
        assertArrayEquals(arr_duplicates, arr_duplicates_sorted);

        //Sorted array
        Integer[] arr_sorted = {1, 2, 3, 4, 5};
        Integer[] arr_sorted_sorted = {1, 2, 3, 4, 5};
        Sorts.selectionSort(arr_sorted);
        assertArrayEquals(arr_sorted, arr_sorted_sorted);

        //One-element array (edge case)
        Integer[] arr_signle = {7};
        Integer[] arr_single_sorted = {7};
        Sorts.selectionSort(arr_signle);
        assertArrayEquals(arr_signle, arr_single_sorted);

        //Empty array
        Integer[] arr_empty = {};
        Integer[] arr_empty_sorted = {};
        Sorts.selectionSort(arr_empty);
        assertArrayEquals(arr_empty, arr_empty_sorted);
    }

    @Test
    public void testMergeSort() {
        //General array
        Integer[] arr_general = {9, 5, 1, 8, 3, 6};
        Integer[] arr_general_sorted = {1, 3, 5, 6, 8, 9};
        Sorts.mergeSort(arr_general);
        assertArrayEquals(arr_general, arr_general_sorted);

        //Duplicates array
        Integer[] arr_duplicates = {6, 8, 0, 0, 8, 3};
        Integer[] arr_duplicates_sorted = {0, 0, 3, 6, 8, 8};
        Sorts.mergeSort(arr_duplicates);
        assertArrayEquals(arr_duplicates, arr_duplicates_sorted);

        //Sorted array
        Integer[] arr_sorted = {1, 2, 3, 4, 5};
        Integer[] arr_sorted_sorted = {1, 2, 3, 4, 5};
        Sorts.mergeSort(arr_sorted);
        assertArrayEquals(arr_sorted, arr_sorted_sorted);

        //One-element array (edge case)
        Integer[] arr_signle = {7};
        Integer[] arr_single_sorted = {7};
        Sorts.mergeSort(arr_signle);
        assertArrayEquals(arr_signle, arr_single_sorted);

        //Empty array
        Integer[] arr_empty = {};
        Integer[] arr_empty_sorted = {};
        Sorts.mergeSort(arr_empty);
        assertArrayEquals(arr_empty, arr_empty_sorted);
    }
    
    @Test
    public void testQuickSort() {
        //General array
        Integer[] arr_general = {9, 5, 1, 8, 3, 6};
        Integer[] arr_general_sorted = {1, 3, 5, 6, 8, 9};
        Sorts.quickSort(arr_general);
        assertArrayEquals(arr_general, arr_general_sorted);

        //Duplicates array
        Integer[] arr_duplicates = {6, 8, 0, 0, 8, 3};
        Integer[] arr_duplicates_sorted = {0, 0, 3, 6, 8, 8};
        Sorts.quickSort(arr_duplicates);
        assertArrayEquals(arr_duplicates, arr_duplicates_sorted);

        //Sorted array
        Integer[] arr_sorted = {1, 2, 3, 4, 5};
        Integer[] arr_sorted_sorted = {1, 2, 3, 4, 5};
        Sorts.quickSort(arr_sorted);
        assertArrayEquals(arr_sorted, arr_sorted_sorted);

        //One-element array (edge case)
        Integer[] arr_signle = {7};
        Integer[] arr_single_sorted = {7};
        Sorts.quickSort(arr_signle);
        assertArrayEquals(arr_signle, arr_single_sorted);

        //Empty array
        Integer[] arr_empty = {};
        Integer[] arr_empty_sorted = {};
        Sorts.quickSort(arr_empty);
        assertArrayEquals(arr_empty, arr_empty_sorted);
    }

        @Test
    public void testHeapSort() {
        //General array
        Integer[] arr_general = {9, 5, 1, 8, 3, 6};
        Integer[] arr_general_sorted = {1, 3, 5, 6, 8, 9};
        Sorts.heapSort(arr_general);
        assertArrayEquals(arr_general, arr_general_sorted);

        //Duplicates array
        Integer[] arr_duplicates = {6, 8, 0, 0, 8, 3};
        Integer[] arr_duplicates_sorted = {0, 0, 3, 6, 8, 8};
        Sorts.heapSort(arr_duplicates);
        assertArrayEquals(arr_duplicates, arr_duplicates_sorted);

        //Sorted array
        Integer[] arr_sorted = {1, 2, 3, 4, 5};
        Integer[] arr_sorted_sorted = {1, 2, 3, 4, 5};
        Sorts.heapSort(arr_sorted);
        assertArrayEquals(arr_sorted, arr_sorted_sorted);

        //One-element array (edge case)
        Integer[] arr_signle = {7};
        Integer[] arr_single_sorted = {7};
        Sorts.heapSort(arr_signle);
        assertArrayEquals(arr_signle, arr_single_sorted);

        //Empty array
        Integer[] arr_empty = {};
        Integer[] arr_empty_sorted = {};
        Sorts.heapSort(arr_empty);
        assertArrayEquals(arr_empty, arr_empty_sorted);
    }
}