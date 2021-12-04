package ru.gb.alekseiterentev;

public enum Manufacturer {

    LENUVO("Lenuvo"),
    ASOS("Asos"),
    MACNOTE("MacNote"),
    ESER("Eser"),
    XAMIOU("Xamiou");

    private final String value;

    Manufacturer(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
