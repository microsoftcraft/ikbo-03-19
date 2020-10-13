package task_fabrika;

import task_fabrika.Complex;
import task_fabrika.ComplexAbstractFactory;

public class ConcreteFactory implements ComplexAbstractFactory
{
    public Complex createComplex()
    {
        return new Complex();
    }

    public Complex CreateComplex(int real, int image)
    {
        return new Complex(real,image);
    }
}