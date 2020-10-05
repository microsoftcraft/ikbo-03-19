package task12.prac.ex2;
import java.util.StringTokenizer;
//Доработать класс адреса, который из полученной строки формата
// "Страна[d] Регион[d] Город[d] Улица[d] Дом[d] Корпус[d] Квартира"
// ([d] – разделитель, например, «запятая») выбирает соответствующие части и
// записывает их в соответствующие поля класса Address. Учесть, что в начале и
// конце разобранной части адреса не должно быть пробелов. Все поля адреса
// строковые. Разработать проверочный класс не менее чем на четыре адресных
// строки. В программе предусмотреть две реализации этого метода:
//
//а) разделитель – только запятая (использовать метод split());
// Внимание, при разработке нужно учесть, что
//
//б) разделитель – любой из символов ,.;- (класс StringTokenizer).
public class Address
{
    private String country,region,city,street,house,block,flat;
    public Address() { }
    public void AddAddress(String s,int i)
    {
        if(i==0)
        {
            country=s;
        }
        if(i==1)
        {
            region=s;
        }
        if(i==2)
        {
            city=s;
        }
        if(i==3)
        {
            street=s;
        }
        if(i==4)
        {
            house=s;
        }
        if(i==5)
        {
            block=s;
        }
        if(i==6)
        {
            flat=s;
        }
    }
    public String toString()
    {
        return ("Полный адрес: "+country+" "+region+" "+city+" "+street+" "+house+" "+block+" "+flat);
    }
    public static void main(String []args)
    {
        int i=0,j=0;
        Address address = new Address();
        String str1=new String("   Россия,77,Москва,Единства,52,1б/2,98  ");
        System.out.println(str1=str1.replaceAll(" ",""));//Удаление пробелов
        for (String retval : str1.split(",")) //Задание а
        {
            address.AddAddress(retval,i);
            i++;
        }
        System.out.println(address.toString());



        String str2=new String("   Россия,77.Москва;Единства-52-1б/2,98  ");
        System.out.println(str2=str2.replaceAll(" ",""));//Удаление пробелов
        StringTokenizer st = new StringTokenizer(str2, ",.;-");//Задание b
        while (st.hasMoreTokens())
        {
            address.AddAddress(st.nextToken(),j);
            j++;
        }
        System.out.println(address.toString());

    }
}
