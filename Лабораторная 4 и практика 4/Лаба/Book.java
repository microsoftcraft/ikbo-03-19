package com.company;

class Book implements Printable
{

    String name;
    String author;
    int year;
    int price;
    Book(String name, String author, int year,int price){
        this.name = name;
        this.author = author;
        this.year = year;
        this.price=price;
    }

    public void print() {

        System.out.printf("Книга '%s' (автор %s) была издана в %d году \n",
                name, author, year);
    }

    public int GetPrice()
    {
        return price;
    }
}
