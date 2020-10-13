package task16.lab;

final class Dish
{
    private double cost;  //Immutable
    private String name,description; //Immutable

    public Dish(String name, String description)
    {
        this.name=name;
        this.description=description;
        this.cost=0;
    }
    public Dish(String name, String description,double cost)
    {
        this.name=name;
        this.description=description;
        this.cost=cost;
    }
    public double GetCost()
    {
        return cost;
    }
    public String GetName()
    {
        return name;
    }
    public String GetDescription()
    {
        return description;
    }


    public void SetCost(double cost)
    {
        this.cost=cost;
    }
    public void SetName(String name)
    {
        this.name=name;
    }
    public void SetDescription(String description)
    {
        this.description=description;
    }

}
