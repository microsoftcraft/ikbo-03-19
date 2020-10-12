package task_fabrika;

import task_fabrika.Complex;
import task_fabrika.ComplexAbstractFactory;
import task_fabrika.ConcreteFactory;

public class Main
{
    public static void main(String[] args)
    {
        Complex a=new Complex(45,9);
        System.out.println(a);

        ComplexAbstractFactory b = new ConcreteFactory();
        Complex c = b.CreateComplex(564, 453);
        System.out.println(c);

        ConcreteFactory d = new ConcreteFactory();
        Complex f = d.CreateComplex(0, 1);
        System.out.println(f);
    }
}
