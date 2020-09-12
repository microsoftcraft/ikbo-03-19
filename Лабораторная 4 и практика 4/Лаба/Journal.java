package com.company;

public class Journal implements Printable
{
    private String name;
    private int price;

    String getName(){
        return name;
    }

    Journal(String name,int price){
        this.price=price;
        this.name = name;
    }
    public void print() {
        System.out.printf("Журнал '%s'\n", name);

    }

    public int GetPrice()
    {
        return price;
    }
}

