package basics.classes.p01methodsiiiwithoutiiiparenthesis;

import scala.reflect.ScalaSignature;

public class Example {
    private final double real;
    private final double imaginary;

    public double re() {
        return this.real;
    }

    public double im() {
        return this.imaginary;
    }

    public Example(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
}
