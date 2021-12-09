package ru.gb.alekseiterentev;

public class NoteBookArrayGenerator {

    public static NoteBook[] generate(int capacity) {
        NoteBook[] arr = new NoteBook[capacity];

        for (int i = 0; i < capacity; i++) {
            NoteBook noteBook = new NoteBook();
            noteBook.setManufacturer(getRandomManufacturer());
            noteBook.setRam(getRandomRam());
            noteBook.setPrice(getRandomPrice());
            arr[i] = noteBook;
        }

        return arr;
    }

    private static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    private static Manufacturer getRandomManufacturer() {
        return Manufacturer.values()[getRandomNumber(0, 4)];
    }

    private static int getRandomRam() {
        return 4 * getRandomNumber(1, 6);
    }

    private static int getRandomPrice() {
        return 300 + 50 * getRandomNumber(0, 50);
    }
}
