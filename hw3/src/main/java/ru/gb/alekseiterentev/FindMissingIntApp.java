package ru.gb.alekseiterentev;

public class FindMissingIntApp {

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7,8,9,10,12,13,14,15,16};
        int missingInt = getMissingInt(input, 0, input.length-1);
        System.out.println(missingInt);
    }

    public static int getMissingInt(int[] arr, int left, int right) {
        if (right == left + 1) return arr[right] - 1;
        int base = left + (right - left) / 2;
        if (arr[base] == arr[left] + (arr[right] - arr[left]) / 2 - (right - left) % 2)
            return getMissingInt(arr, base, right);
        else
            return getMissingInt(arr, left, base);
    }
}
