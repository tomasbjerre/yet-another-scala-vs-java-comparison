package basics.classes.p01methodsiiiwithoutiiiparenthesis;

import scala.reflect.ScalaSignature;

public class ExampleWithoutParenthesis {
    private final double real;
    private final double imaginary;

    public double re() {
        return this.real;
    }

    public double im() {
        return this.imaginary;
    }

    public ExampleWithoutParenthesis(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
}
