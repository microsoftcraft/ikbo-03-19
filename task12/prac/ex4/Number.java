package task12.prac.ex4;
//Разработайте класс, который получает строковое представление телефонного
// номера в одном из двух возможных строковых форматов:
//
//+<Код страны><Номер 10 цифр>, например “+79175655655” или
//
//“+104289652211” или
//
//8<Номер 10 цифр> для России, например “89175655655”
//
//и преобразует полученную строку в формат:
//
//+<Код страны><Три цифры>–<Три цифры>–<Четыре цифры>
public class Number
{
    private String number,  kod="<";
    public Number(String number)
    {
        this.number=number;
        NewNumber(number);
    }
    public void NewNumber(String number)
    {
        String first,second;
        char ch = number.charAt(0);
        if(ch=='+')
        {
            number=number.substring(1);
            number=NewNumberHelper(number);
            System.out.println(ch+kod+"><"+number+">");
        }
        else {
            kod=number.substring(0,1);
            System.out.println("+<"+kod+"><"+number.substring(1,4)+"><"+number.substring(4,7)+"><"+number.substring(7,11)+">");

        }
    }
    public String NewNumberHelper(String number)
    {
        if(number.length()>10)
        {
            kod =kod+ number.charAt(0);
            number=number.substring(1);
            NewNumberHelper(number);
        }
        return (number.substring(1));
    }

    public static void main(String []args)
    {
        Number number = new Number("+104289652211");
        Number number2 = new Number("89175655655");

    }
}
