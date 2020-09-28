//  Клиент совершает покупку онлайн. При оформлении заказа у пользователя запрашивается фио и
//  номер ИНН. В программе проверяется, действителен ли номер ИНН для такого клиента. Исключение будет
//  выдано в том случае, если введен недействительный ИНН.

public class Account
{
    private String INN;
    private String name;

    public Account(String INN, String name)
    {
        this.INN = INN;
        this.name = name;
    }
    public String get_INN()
    {
        return INN;
    }

    public String getName()
    {
        return name;
    }
    public void test_INN(String inn) throws Verification_INN
    {
        if(inn.length()!=10)
            throw new Verification_INN(this);
    }
    
    public static void main(String[] args)
    {
        Account client=new Account("11223344556677889900","Горшунов В.Е.");
        try {
            client.test_INN(client.get_INN());
            System.out.println("ИНН клиента "+client.getName()+" действителен.");
        } catch (Verification_INN e) {
            System.out.println(e.getMessage());;
        }

        Account client1=new Account("1234567890","Петров В.Е.");
        try {
            client1.test_INN(client1.get_INN());
            System.out.println("ИНН клиента "+client1.getName()+" действителен.");
        } catch (Verification_INN e) {
            System.out.println(e.getMessage());;
        }

        Account client2=new Account("5641","Иванов Е.М.");
        try {
            client2.test_INN(client2.get_INN());
            System.out.println("ИНН клиента "+client2.getName()+" действителен.");
        } catch (Verification_INN e) {
            System.out.println(e.getMessage());
        }
    }
}