package task12.prac.ex1;
//Разработать класс Person, в котором имеется функция,
// возвращающая Фамилию И.О. Функция должна учитывать возможность отсутствия
// значений в полях Имя и Отчество.
public class Person
{
    private String name,surname,patronymic;

    Person(String surname)
    {
        this.surname=surname;
    }

    Person(String surname,String name,String patronymic)
    {
        this.surname=surname;
        this.name=name;
        this.patronymic=patronymic;
    }
    public String toString()
    {
        if(name==null || patronymic==null)
        {
            return(surname);
        }
        else
        {
            return(surname+" "+name+" "+patronymic);

        }
    }

    public static void main(String []args)
    {
        Person people=new Person("Новиков","Владислав","Петрович");
        System.out.println(people.toString());
        Person people1=new Person("Соколов");
        System.out.println(people1.toString());
    }

}
