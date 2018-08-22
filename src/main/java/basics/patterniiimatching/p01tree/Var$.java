package basics.patterniiimatching.p01tree;

import basics.patterniiimatching.p01tree.Var;
import scala.None$;
import scala.Option;
import scala.Serializable;
import scala.Some;
import scala.runtime.AbstractFunction1;

public final class Var$
extends AbstractFunction1<String, Var>
implements Serializable {
    public static final Var$ MODULE$;

    public static {
        new basics.patterniiimatching.p01tree.Var$();
    }

    public final String toString() {
        return "Var";
    }

    public Var apply(String n) {
        return new Var(n);
    }

    public Option<String> unapply(Var x$0) {
        return x$0 == null ? None$.MODULE$ : new Some((Object)x$0.n());
    }

    private Object readResolve() {
        return MODULE$;
    }

    private Var$() {
        MODULE$ = this;
    }
}
