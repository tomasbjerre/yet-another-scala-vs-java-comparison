
[<< back](https://github.com/tomasbjerre/yet-another-scala-vs-java-comparison)

-----------------------------

# Methods Without Parenthesis

## Scala

**Example.scala**

```scala
package basics.classes.p01methodsiiiwithoutiiiparenthesis

class Example(real: Double, imaginary: Double) {
  def re() = real
  def im() = imaginary
}

object ExampleUsage {
  def main(args: Array[String]) {
    val c = new Example(1.2, 3.4)
    println("imaginary part: " + c.im())
  }
}

class ExampleWithoutParenthesis(real: Double, imaginary: Double) {
  def re = real
  def im = imaginary
}

object ExampleWithoutParenthesisUsage {
  def main(args: Array[String]) {
    val c = new ExampleWithoutParenthesis(1.2, 3.4)
    println("imaginary part: " + c.im)
  }
}
```

## Java

**ExampleWithoutParenthesis.java**

```java
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

```

**ExampleUsage$.java**

```java
package basics.classes.p01methodsiiiwithoutiiiparenthesis;

import basics.classes.p01methodsiiiwithoutiiiparenthesis.Example;
import scala.Predef$;
import scala.collection.mutable.StringBuilder;
import scala.runtime.BoxesRunTime;

public final class ExampleUsage$ {
    public static final ExampleUsage$ MODULE$;

    public static {
        new basics.classes.p01methodsiiiwithoutiiiparenthesis.ExampleUsage$();
    }

    public void main(String[] args) {
        Example c = new Example(1.2, 3.4);
        Predef$.MODULE$.println((Object)new StringBuilder().append((Object)"imaginary part: ").append((Object)BoxesRunTime.boxToDouble((double)c.im())).toString());
    }

    private ExampleUsage$() {
        MODULE$ = this;
    }
}

```

**ExampleWithoutParenthesisUsage.java**

```java
package basics.classes.p01methodsiiiwithoutiiiparenthesis;

import basics.classes.p01methodsiiiwithoutiiiparenthesis.ExampleWithoutParenthesisUsage$;
import scala.reflect.ScalaSignature;

public final class ExampleWithoutParenthesisUsage {
    public static void main(String[] arrstring) {
        ExampleWithoutParenthesisUsage$.MODULE$.main(arrstring);
    }
}

```

**Example.java**

```java
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

```

**ExampleWithoutParenthesisUsage$.java**

```java
package basics.classes.p01methodsiiiwithoutiiiparenthesis;

import basics.classes.p01methodsiiiwithoutiiiparenthesis.ExampleWithoutParenthesis;
import scala.Predef$;
import scala.collection.mutable.StringBuilder;
import scala.runtime.BoxesRunTime;

public final class ExampleWithoutParenthesisUsage$ {
    public static final ExampleWithoutParenthesisUsage$ MODULE$;

    public static {
        new basics.classes.p01methodsiiiwithoutiiiparenthesis.ExampleWithoutParenthesisUsage$();
    }

    public void main(String[] args) {
        ExampleWithoutParenthesis c = new ExampleWithoutParenthesis(1.2, 3.4);
        Predef$.MODULE$.println((Object)new StringBuilder().append((Object)"imaginary part: ").append((Object)BoxesRunTime.boxToDouble((double)c.im())).toString());
    }

    private ExampleWithoutParenthesisUsage$() {
        MODULE$ = this;
    }
}

```

**ExampleUsage.java**

```java
package basics.classes.p01methodsiiiwithoutiiiparenthesis;

import basics.classes.p01methodsiiiwithoutiiiparenthesis.ExampleUsage$;
import scala.reflect.ScalaSignature;

public final class ExampleUsage {
    public static void main(String[] arrstring) {
        ExampleUsage$.MODULE$.main(arrstring);
    }
}

```
