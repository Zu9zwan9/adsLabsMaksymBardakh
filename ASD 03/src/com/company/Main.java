package com.company;

import java.util.Random;

public class Main {
    public static void bubbleSort(int[] arr, boolean isSorted) {
        long start = System.currentTimeMillis();
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        long finish = System.currentTimeMillis();
        System.out.println("bubble Sort elements count: " + arr.length + "; time took " + (finish - start) + (isSorted ? " sorted" : " random"));
    }

    public static void main(String[] args) {
        int[] randomA = new int[100];
        int[] randomB = new int[1000];
        int[] randomC = new int[10000];
        Random Z = new Random();

        for (int i = 0; i < randomA.length; i++) {
            randomA[i] = i + Z.nextInt(5000);
        }
        bubbleSort(randomA.clone(), false); /*создаем новый сортируем бабл сортом, а потом создаем новый и отправляем
        на сортировку на инсершен сорт*/
        SortingAlgorithms.insertionSort(randomA.clone(), false);
        SelectionAlgorithm.selectionSort(randomA.clone(), false);
        for (int i = 0; i < randomB.length; i++) {
            randomB[i] = i + Z.nextInt(5000);
        }
        bubbleSort(randomB.clone(), false); /*создаем новый сортируем бабл сортом, а потом создаем новый и отправляем
        на сортировку на инсершен сорт*/
        SortingAlgorithms.insertionSort(randomB.clone(), false);
        SelectionAlgorithm.selectionSort(randomB.clone(), false);
        for (int i = 0; i < randomC.length; i++) {
            randomC[i] = i + Z.nextInt(5000); //геренирует случайную цифру от i - 5k
        }
        bubbleSort(randomC.clone(), false); /*создаем новый сортируем бабл сортом, а потом создаем новый и отправляем
        на сортировку на инсершен сорт*/
        SortingAlgorithms.insertionSort(randomC.clone(), false);
        SelectionAlgorithm.selectionSort(randomC.clone(), false);
        int[] sortedA = new int[100];
        int[] sortedB = new int[1000];
        int[] sortedC = new int[10000];

        for (int i = 0; i < sortedA.length; i++) {
            sortedA[i] = i + 1;
        }
        bubbleSort(sortedA.clone(), true); /*создаем новый сортируем бабл сортом, а потом создаем новый и отправляем
        на сортировку на инсершен сорт*/
        SortingAlgorithms.insertionSort(sortedA.clone(), true);
        SelectionAlgorithm.selectionSort(sortedA.clone(), true);
        for (int i = 0; i < sortedB.length; i++) {
            sortedB[i] = i + 1;
        }
        bubbleSort(sortedB.clone(), true); /*создаем новый сортируем бабл сортом, а потом создаем новый и отправляем
        на сортировку на инсершен сорт*/
        SortingAlgorithms.insertionSort(sortedB.clone(), true);
        SelectionAlgorithm.selectionSort(sortedB.clone(), true);
        for (int i = 0; i < sortedC.length; i++) {
            sortedC[i] = i + 1;
        }
        bubbleSort(sortedC.clone(), true); /*создаем новый сортируем бабл сортом, а потом создаем новый и отправляем
        на сортировку на инсершен сорт*/
        SortingAlgorithms.insertionSort(sortedC.clone(), true);
        SelectionAlgorithm.selectionSort(sortedC.clone(), true);
    }
}
