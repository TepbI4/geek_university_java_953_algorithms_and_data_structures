package ru.gb.alekseiterentev;

public class PowApp {

    public static void main(String[] args) {
        System.out.println(pow(2, 7));
    }

    public static int pow(int base, int a) {
        if (a == 0) return 1;
        return base * pow(base, --a);
    }
}
