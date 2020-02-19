package ru.gb.java3.l1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    private static <T> void swapArrayElements(T[] array, int posA, int posB) {
        T tmp = array[posA];
        array[posA] = array[posB];
        array[posB] = tmp;
    }

    private static <T> ArrayList arrayToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    private static <T> void printArr(T[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {

        Integer[] arrayInt = {1, 2, 3, 4, 5};
        String[] arrayStr = {"alpha", "beta", "gamma", "delta", "epsilon"};

        // swap elements in array of Integer
        printArr(arrayInt);
        swapArrayElements(arrayInt, 2, 3);
        printArr(arrayInt);

        // swap elements in array of String
        printArr(arrayStr);
        swapArrayElements(arrayStr, 2, 3);
        printArr(arrayStr);

        // convert array to array list and append an element
        ArrayList arrList = arrayToList(arrayInt);
        arrList.add(6);
        printArr(arrList.toArray());
    }
}
