package com.company;

public class Test
{
    public static void main(String[] args) {

        Book printable = new Book("Война и мир", "Л. Н. Толстой", 1863, 164);
        printable.print();
        Journal journal = new Journal("Неизвестно",94);
        journal.print();
        System.out.println("Цена за книгу: "+printable.GetPrice()+" \nЦена на журнал: "+journal.GetPrice());
    }
}
