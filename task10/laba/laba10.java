package task10.laba;//Написать метод для конвертации массива строк/чисел в список.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class laba10
{
    public  static void main(String[] args)
    {
        Integer[] arrayOfStrings = {1, 2, 3, 4};

        List<Integer> listOfStrings = new ArrayList<Integer>();
        listOfStrings = Arrays.asList(arrayOfStrings);
        System.out.println("Массив int");
        for (Integer str : listOfStrings)
            System.out.print(" " + str);

        String[] arrayOfStrings1 = {"5", "6", "7", "8"};
        List<String> listOfStrings1 = new ArrayList<String>();
        listOfStrings1 = Arrays.asList(arrayOfStrings1);
        System.out.println("\nМассив String");
        for (String str : listOfStrings1)
            System.out.print(" " + str);

    }
}
