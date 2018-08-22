package basics.patterniiimatching.p01tree;

import basics.patterniiimatching.p01tree.Const;
import scala.None$;
import scala.Option;
import scala.Serializable;
import scala.Some;
import scala.runtime.AbstractFunction1;
import scala.runtime.BoxesRunTime;

public final class Const$
extends AbstractFunction1<Object, Const>
implements Serializable {
    public static final Const$ MODULE$;

    public static {
        new basics.patterniiimatching.p01tree.Const$();
    }

    public final String toString() {
        return "Const";
    }

    public Const apply(int v) {
        return new Const(v);
    }

    public Option<Object> unapply(Const x$0) {
        return x$0 == null ? None$.MODULE$ : new Some((Object)BoxesRunTime.boxToInteger((int)x$0.v()));
    }

    private Object readResolve() {
        return MODULE$;
    }

    private Const$() {
        MODULE$ = this;
    }
}
