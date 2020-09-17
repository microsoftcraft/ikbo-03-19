package com.company.laba7;
import java.util.ArrayList;
import java.util.LinkedList;
public class ArrayLit
{
    public  static void main(String[] args)
    {
        ArrayList<Integer> arraylist = new ArrayList<>();

        for (int i = 0; i < 10; i++)
        {
            arraylist.add(i);
        }

        for (var t : arraylist)
        {
            System.out.print(t+" ");
        }   
        System.out.println("\n");
        LinkedList<Integer> linkedlist = new LinkedList<>();
        for (int i = 10; i > 0; i--)
        {
            linkedlist.add(i);
        }

        for (var t : linkedlist)
        {
            System.out.print(t+" ");
        }
    }
}
