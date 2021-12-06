package ru.gb.alekseiterentev;

public enum Manufacturer {

    XAMIOU("Xamiou"),
    ESER("Eser"),
    MACNOTE("MacNote"),
    ASOS("Asos"),
    LENUVO("Lenuvo")
    ;

    private final String value;

    Manufacturer(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
