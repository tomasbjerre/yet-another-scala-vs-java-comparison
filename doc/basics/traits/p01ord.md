
[<< back](https://github.com/tomasbjerre/yet-another-scala-vs-java-comparison)

-----------------------------

# Ord

## Scala

**Example.scala**

```scala
package basics.traits.p01ord

trait Ord {
  def < (that: Any): Boolean
  def <=(that: Any): Boolean =  (this < that) || (this == that)
  def > (that: Any): Boolean = !(this <= that)
  def >=(that: Any): Boolean = !(this < that)
}

class Date(y: Int, m: Int, d: Int) extends Ord {
  def year = y

  def month = m

  def day = d

  override def toString(): String = year + "-" + month + "-" + day

  override def equals(that: Any): Boolean =
    that.isInstanceOf[Date] && {
      val o = that.asInstanceOf[Date]
      o.day == day && o.month == month && o.year == year
    }

  def <(that: Any): Boolean = {
    if (!that.isInstanceOf[Date])
      sys.error("cannot compare " + that + " and a Date")

    val o = that.asInstanceOf[Date]
    (year < o.year) ||
      (year == o.year && (month < o.month ||
        (month == o.month && day < o.day)))
  }
}
```

## Java

**Ord$class.java**

```java
package basics.traits.p01ord;

import basics.traits.p01ord.Ord;

public abstract class Ord$class {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean $less$eq(Ord $this, Object that) {
        if ($this.$less(that)) return true;
        Ord ord = $this;
        Object object = that;
        if (ord != null) {
            if (!ord.equals(object)) return false;
            return true;
        }
        if (object == null) return true;
        return false;
    }

    public static boolean $greater(Ord $this, Object that) {
        return !$this.$less$eq(that);
    }

    public static boolean $greater$eq(Ord $this, Object that) {
        return !$this.$less(that);
    }

    public static void $init$(Ord $this) {
    }
}

```

**Date.java**

```java
package basics.traits.p01ord;

import basics.traits.p01ord.Ord;
import basics.traits.p01ord.Ord$class;
import scala.collection.mutable.StringBuilder;
import scala.reflect.ScalaSignature;
import scala.runtime.BoxesRunTime;
import scala.runtime.Nothing$;
import scala.sys.package$;

public class Date
implements Ord {
    private final int y;
    private final int m;
    private final int d;

    @Override
    public boolean $less$eq(Object that) {
        return Ord$class.$less$eq(this, that);
    }

    @Override
    public boolean $greater(Object that) {
        return Ord$class.$greater(this, that);
    }

    @Override
    public boolean $greater$eq(Object that) {
        return Ord$class.$greater$eq(this, that);
    }

    public int year() {
        return this.y;
    }

    public int month() {
        return this.m;
    }

    public int day() {
        return this.d;
    }

    public String toString() {
        return new StringBuilder().append(this.year()).append((Object)"-").append((Object)BoxesRunTime.boxToInteger((int)this.month())).append((Object)"-").append((Object)BoxesRunTime.boxToInteger((int)this.day())).toString();
    }

    public boolean equals(Object that) {
        Date o;
        return that instanceof Date && (o = (Date)that).day() == this.day() && o.month() == this.month() && o.year() == this.year();
    }

    @Override
    public boolean $less(Object that) {
        if (that instanceof Date) {
            Date o = (Date)that;
            return this.year() < o.year() || this.year() == o.year() && (this.month() < o.month() || this.month() == o.month() && this.day() < o.day());
        }
        throw package$.MODULE$.error(new StringBuilder().append((Object)"cannot compare ").append(that).append((Object)" and a Date").toString());
    }

    public Date(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
        Ord$class.$init$(this);
    }
}

```

**Ord.java**

```java
package basics.traits.p01ord;

import scala.reflect.ScalaSignature;

public interface Ord {
    public boolean $less(Object var1);

    public boolean $less$eq(Object var1);

    public boolean $greater(Object var1);

    public boolean $greater$eq(Object var1);
}

```
