
[<< back](https://github.com/tomasbjerre/yet-another-scala-vs-java-comparison)

-----------------------------

# Everything Is An Object

## Scala

**Example.scala**

```scala
package basics.introduction.p03everythingiiiisiiianiiiobject

object Example {
  def main(x:Int) {
    val y =    1 + 2 * 3 / x
    println(y)

    val y2 =    (1).+(((2).*(3))./(x))
    println(y2)
  }
}

```

## Java

**Example.java**

```java
package basics.introduction.p03everythingiiiisiiianiiiobject;

import basics.introduction.p03everythingiiiisiiianiiiobject.Example$;
import scala.reflect.ScalaSignature;

public final class Example {
    public static void main(int n) {
        Example$.MODULE$.main(n);
    }
}

```

**Example$.java**

```java
package basics.introduction.p03everythingiiiisiiianiiiobject;

import scala.Predef$;
import scala.runtime.BoxesRunTime;

public final class Example$ {
    public static final Example$ MODULE$;

    public static {
        new basics.introduction.p03everythingiiiisiiianiiiobject.Example$();
    }

    public void main(int x) {
        int y = 1 + 6 / x;
        Predef$.MODULE$.println((Object)BoxesRunTime.boxToInteger((int)y));
        int y2 = 1 + 6 / x;
        Predef$.MODULE$.println((Object)BoxesRunTime.boxToInteger((int)y2));
    }

    private Example$() {
        MODULE$ = this;
    }
}

```
