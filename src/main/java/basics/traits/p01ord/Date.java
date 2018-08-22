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
