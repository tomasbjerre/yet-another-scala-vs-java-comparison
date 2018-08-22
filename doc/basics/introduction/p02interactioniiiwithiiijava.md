
[<< back](https://github.com/tomasbjerre/yet-another-scala-vs-java-comparison)

-----------------------------

# Interaction With Java

## Scala

**FrenchDate.scala**

```scala
package basics.introduction.p02interactioniiiwithiiijava

import java.text.DateFormat.{LONG, getDateInstance}
import java.util.{Date, Locale}

object FrenchDate {
  def main(args: Array[String]) {
    val now = new Date
    val df = getDateInstance(LONG, Locale.FRANCE)
    println(df format now)
  }
}

```

## Java

**FrenchDate.java**

```java
package basics.introduction.p02interactioniiiwithiiijava;

import basics.introduction.p02interactioniiiwithiiijava.FrenchDate$;
import scala.reflect.ScalaSignature;

public final class FrenchDate {
    public static void main(String[] arrstring) {
        FrenchDate$.MODULE$.main(arrstring);
    }
}

```

**FrenchDate$.java**

```java
package basics.introduction.p02interactioniiiwithiiijava;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import scala.Predef$;

public final class FrenchDate$ {
    public static final FrenchDate$ MODULE$;

    public static {
        new basics.introduction.p02interactioniiiwithiiijava.FrenchDate$();
    }

    public void main(String[] args) {
        Date now = new Date();
        DateFormat df = DateFormat.getDateInstance(1, Locale.FRANCE);
        Predef$.MODULE$.println((Object)df.format(now));
    }

    private FrenchDate$() {
        MODULE$ = this;
    }
}

```
