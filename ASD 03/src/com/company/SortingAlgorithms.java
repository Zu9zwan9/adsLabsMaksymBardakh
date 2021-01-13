package com.company;

public class SortingAlgorithms {

    public static void insertionSort(int[] arr, boolean isSorted) {
        long start = System.currentTimeMillis();
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        long finish = System.currentTimeMillis();
        System.out.println("insertion Sort elements count: " + arr.length + "; time took " + (finish - start) + (isSorted ? " sorted" : " random"));
    }
}