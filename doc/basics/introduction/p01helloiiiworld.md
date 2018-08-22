
[<< back](https://github.com/tomasbjerre/yet-another-scala-vs-java-comparison)

-----------------------------

# Hello World

## Scala

**HelloWorld.scala**

```scala
package basics.introduction.p01helloiiiworld

object HelloWorld {
  def main(args: Array[String]) {
    println("Hello, world!")
  }
}

```

## Java

**HelloWorld$.java**

```java
package basics.introduction.p01helloiiiworld;

import scala.Predef$;

public final class HelloWorld$ {
    public static final HelloWorld$ MODULE$;

    public static {
        new basics.introduction.p01helloiiiworld.HelloWorld$();
    }

    public void main(String[] args) {
        Predef$.MODULE$.println((Object)"Hello, world!");
    }

    private HelloWorld$() {
        MODULE$ = this;
    }
}

```

**HelloWorld.java**

```java
package basics.introduction.p01helloiiiworld;

import basics.introduction.p01helloiiiworld.HelloWorld$;
import scala.reflect.ScalaSignature;

public final class HelloWorld {
    public static void main(String[] arrstring) {
        HelloWorld$.MODULE$.main(arrstring);
    }
}

```
