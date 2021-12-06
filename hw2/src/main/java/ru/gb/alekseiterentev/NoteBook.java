package ru.gb.alekseiterentev;

public class NoteBook implements Comparable<NoteBook> {
    private int price;
    private int ram;
    private Manufacturer manufacturer;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "price=" + price +
                ", ram=" + ram +
                ", manufacturer=" + manufacturer +
                '}';
    }

    @Override
    public int compareTo(NoteBook o) {
        if (this.getPrice() == o.getPrice()) {
            if (this.getRam() == o.getRam()) {
                return this.getManufacturer().compareTo(o.getManufacturer());
            }
            return Integer.compare(this.getRam(), o.getRam());
        }
        return Integer.compare(this.getPrice(), o.getPrice());
    }
}
