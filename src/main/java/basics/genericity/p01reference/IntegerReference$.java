package basics.genericity.p01reference;

import basics.genericity.p01reference.Reference;
import scala.Predef$;
import scala.collection.mutable.StringBuilder;
import scala.runtime.BoxesRunTime;

public final class IntegerReference$ {
    public static final IntegerReference$ MODULE$;

    public static {
        new basics.genericity.p01reference.IntegerReference$();
    }

    public void main(String[] args) {
        Reference<Integer> cell = new Reference<Integer>();
        cell.set(BoxesRunTime.boxToInteger((int)13));
        Predef$.MODULE$.println((Object)new StringBuilder().append((Object)"Reference contains the half of ").append((Object)BoxesRunTime.boxToInteger((int)(BoxesRunTime.unboxToInt(cell.get()) * 2))).toString());
    }

    private IntegerReference$() {
        MODULE$ = this;
    }
}
