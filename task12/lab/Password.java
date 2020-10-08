package task12.lab;
//Проверить, надежно ли составлен пароль. Пароль считается надежным,
// если он состоит из 8 или более символов. Где символом может быть цифр,
// английская буква, и знак подчеркивания. Пароль должен содержать хотя бы
// одну заглавную букву, одну маленькую букву и одну цифру.
// – пример правильных выражений: F032_Password, TrySpy17.
// – пример неправильных выражений: smart_pass, A007.
public class Password
{
    public Password(String password)
    {
        System.out.println(password+" - "+Helper(password));
    }

    public boolean Helper(String password)
    {
        if(password.length()>7)
        {
                    if(password.matches(".*[A-Z].*"))
                    {
                        if (password.matches(".*[a-z].*"))
                        {

                            if (password.matches(".*[0-9].*"))
                                return true;
                        }
                    }

            }

        return (false);
    }

    public static void main(String []args)
    {
        Password pas_1 = new Password("F032_Password");
        Password pas_2 = new Password("TrySpy17");
        Password pas_3 = new Password("smart_pass");
        Password pas_4 = new Password("A007");

    }
}
