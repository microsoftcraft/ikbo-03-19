package task_fabrika;

import task_fabrika.Complex;

public interface ComplexAbstractFactory
{
    Complex createComplex();
    Complex CreateComplex(int real, int image);
}
