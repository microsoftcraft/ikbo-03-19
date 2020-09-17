package com.company.prac7;
import java.util.Stack;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Cards
{
    static void game(Stack<Integer> first_player, Stack<Integer> second_player)
    {
        int step = 0;

        while (!first_player.isEmpty() && !second_player.isEmpty() && step < 106)
        {
            step++;

            var t1 = first_player.pop();
            var t2 = second_player.pop();

            if (t1 > t2)
            {
                second_player.push(t1);
                second_player.push(t2);
            }
            else if (t1 < t2)
            {
                first_player.push(t1);
                first_player.push(t2);
            }
            else
            {
                first_player.push(t1);
                second_player.push(t2);
            }
        }

        if (first_player.isEmpty()) System.out.println("first " + step);   //Если первый пустой
        else if (second_player.isEmpty()) System.out.println("second " + step); //Если вторпой пустой
        else System.out.println("botva");
    }

    public static void main(String[] args) throws Exception
    {
        var first  = new Stack<Integer>();
        var second = new Stack<Integer>();

        var reader = new BufferedReader(new InputStreamReader(System.in));

        // Ввод данных для 1ого игрока

        var input = reader.readLine();// следующая строка
        var splited = input.split(" ");//разделить строку на слова

        for (var t : splited)
        {
            first.push(Integer.parseInt(t));
        }

        // Ввод данных для 2ого игрока

        input = reader.readLine();
        splited = input.split(" ");

        for (var t : splited)
        {
            second.push(Integer.parseInt(t));
        }

        game(first, second);
    }
}
