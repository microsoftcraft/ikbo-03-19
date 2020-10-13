package task16.lab;

public class Drink
{
    private double alcoholVol;
    private DrinkTypeEnum type;


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
