package task16.lab;

public class Customer {
    private String firstName, secondName;
    private int age;
    private Address address;
    private Customer MATURE_UNKNOWN_CUSTOMER, NOT_MATURE_UNKNOWN_CUSTOMER;

    public Customer(String firstName,String secondName, int age)
    {
        this.firstName=firstName;
        this.secondName=secondName;
        this.age=age;
    }
    public String getFirstName()
    {
        return  firstName;
    }
    public String getSecondName()
    {
        return secondName;
    }
    public int getAge()
    {
        return age;
    }
    public  Address getAddress()
    {
        return address;
    }
}
