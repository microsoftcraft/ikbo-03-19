package com.company;
import java.util.Scanner;
public class Number7
{
    public static void recursion(int n, int k)
    {
        if (k > n / 2)
        {
            System.out.print(n+" ");
            return;
        }

        if (n % k == 0)
        {
            System.out.print(k+" ");
            recursion(n / k, k);
        }
        else
        {
            recursion(n, ++k);
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        recursion(scan.nextInt(), 2);
    }
}

//Дано натуральное число n>1. Выведите все простые множители этого
//числа в порядке не убывания с учетом кратности.