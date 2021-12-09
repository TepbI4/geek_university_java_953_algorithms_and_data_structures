package ru.gb.alekseiterentev;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        NoteBook[] arr = NoteBookArrayGenerator.generate(10000);

        long start = System.currentTimeMillis();

        sort(arr);

        System.out.println(System.currentTimeMillis() - start);

//        System.out.println(Arrays.toString(arr));
    }

    public static void sort(Comparable[] arr){
        for (int i = 1; i < arr.length; i++) {

            int j = i - 1;
            Comparable value = arr[i];
            while (j >= 0 && arr[j].compareTo(value) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = value;
        }
    }
}
