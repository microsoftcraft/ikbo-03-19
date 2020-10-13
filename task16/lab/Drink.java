package task16.lab;

public class Drink
{
    private double alcoholVol;
    private DrinkTypeEnum type;

    public Drink(DrinkTypeEnum type, double alcoholVol) 
    {
        this.type=type;
        this.alcoholVol=alcoholVol;
    }
   

    DrinkTypeEnum TakeType()
    {
        return type;
    }

    public double getAlco()
    {
        return alcoholVol;
    }

    public void setAlco(int alcoholVol)
    {
        this.alcoholVol=alcoholVol;
    }
}
