package com.company;

public class Number8
{
    public static boolean recursion(String s) {
        char firstChar;
        char lastChar;
        int size = s.length();
        String subString;
        if (size <= 1)
        {
            return true;
        } else
        {
            firstChar = s.toCharArray()[0];
            lastChar = s.toCharArray()[size - 1];
            subString = s.substring(1, size - 1);
            return firstChar == lastChar && recursion(subString);
        }
    }
    public static void main(String[] args)
    {
        if (recursion("доход"))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
//Дано слово, состоящее только из строчных латинских букв. Проверьте,
//является ли это слово палиндромом. Выведите YES или NO.