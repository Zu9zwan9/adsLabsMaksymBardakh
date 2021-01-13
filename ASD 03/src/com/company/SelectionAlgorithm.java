package com.company;

public class SelectionAlgorithm {
    public static void selectionSort(int[] array, boolean isSorted) {
        long start = System.currentTimeMillis();
        int size = array.length;

        for (int i = 0; i < size - 1; i++) {
            int min = i;

            for (int j = i + 1; j < size; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        long finish = System.currentTimeMillis();
        System.out.println("selection Sort elements count: " + array.length + "; time took " + (finish - start) + (isSorted ? " sorted" : " random"));

    }
}
