package ru.gb.alekseiterentev;

public class FindMissingIntApp {

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7,8,9,10,12,13,14,15,16};

        if (input.length > 0) {
            int left = 0;
            int right = input.length-1;
            while (right != left + 1) {
                int base = left + (right - left) / 2;
                if (input[base] == input[left] + (input[right] - input[left]) / 2 - (right - left) % 2)
                    left = base;
                else
                    right = base;
            }
            System.out.println(input[right] - 1);
        } else {
            System.out.println(1);
        }
    }
}
