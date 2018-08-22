
[<< back](https://github.com/tomasbjerre/yet-another-scala-vs-java-comparison)

-----------------------------

# Overriding

## Scala

**Example.scala**

```scala
package basics.classes.p02overriding

class Example(real: Double, imaginary: Double) {
  def re = real
  def im = imaginary
  override def toString() =
    "" + re + (if (im < 0) "" else "+") + im + "i"
}

```

## Java

**Example.java**

```java
package basics.classes.p02overriding;

import scala.collection.mutable.StringBuilder;
import scala.reflect.ScalaSignature;
import scala.runtime.BoxesRunTime;

public class Example {
    private final double real;
    private final double imaginary;

    public double re() {
        return this.real;
    }

    public double im() {
        return this.imaginary;
    }

    public String toString() {
        return new StringBuilder().append((Object)"").append((Object)BoxesRunTime.boxToDouble((double)this.re())).append((Object)(this.im() < (double)false ? "" : "+")).append((Object)BoxesRunTime.boxToDouble((double)this.im())).append((Object)"i").toString();
    }

    public Example(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
}

```
